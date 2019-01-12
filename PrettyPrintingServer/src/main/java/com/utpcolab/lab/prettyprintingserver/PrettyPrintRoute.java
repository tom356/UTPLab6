package com.utpcolab.lab.prettyprintingserver;

import com.utpcolab.lab.prettyprintingserver.prettyprinters.DefaultPrettyPrinter;
import com.utpcolab.lab.prettyprintingserver.prettyprinters.JSONPrettyPrinter;
import com.utpcolab.lab.prettyprintingserver.prettyprinters.PrettyPrinter;
import com.utpcolab.lab.prettyprintingserver.prettyprinters.XMLPrettyPrinter;
import java.util.HashMap;
import java.util.Map;
import spark.Request;
import spark.Response;
import spark.Route;

/**
 *
 * @author Tomek
 */
public class PrettyPrintRoute implements Route {

    Map<String, PrettyPrinter> prettyPrinters = new HashMap<String, PrettyPrinter>();

    PrettyPrintRoute() {
        prettyPrinters.put("default", new DefaultPrettyPrinter());
        prettyPrinters.put("xml", new XMLPrettyPrinter());
        prettyPrinters.put("json", new JSONPrettyPrinter());
    }

    @Override
    public Object handle(Request request, Response response) throws Exception {
        PrettyPrinter selectedPrettyPrinter = prettyPrinters.get(request.params(":datatype"));
        if (selectedPrettyPrinter == null) {
            selectedPrettyPrinter = prettyPrinters.get("default");
        }
        return selectedPrettyPrinter.prettyPrint(request.body());
    }

}

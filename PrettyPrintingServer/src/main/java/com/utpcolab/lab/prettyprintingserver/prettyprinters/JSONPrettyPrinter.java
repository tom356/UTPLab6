package com.utpcolab.lab.prettyprintingserver.prettyprinters;

import org.json.JSONObject;

/**
 *
 * @author Tomek
 */
public class JSONPrettyPrinter implements PrettyPrinter {

    @Override
    public String prettyPrint(String source) {
        return new JSONObject(source).toString(4);
    }

}

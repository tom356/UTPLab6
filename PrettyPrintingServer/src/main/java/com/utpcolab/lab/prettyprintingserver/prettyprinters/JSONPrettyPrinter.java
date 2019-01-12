/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

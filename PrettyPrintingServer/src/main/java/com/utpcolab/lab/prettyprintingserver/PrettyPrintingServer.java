/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utpcolab.lab.prettyprintingserver;

import spark.Spark;

/**
 *
 * @author Tomek
 */
public class PrettyPrintingServer {
    public static void main(String[] args) {
        System.out.println("hosting on: \nhtml: localhost:4567\nAPI: localhost:4567/API/PrettyPrint/:dataType");
        Spark.staticFiles.location("/web");
        Spark.post("/API/PrettyPrint/:dataType", new PrettyPrintRoute());
    }
}

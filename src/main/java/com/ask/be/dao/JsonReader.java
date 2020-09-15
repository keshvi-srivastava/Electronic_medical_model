package com.ask.be.dao;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonReader {

	    public static void fileReader(String path) {

	    	JSONParser parser = new JSONParser();

	        try {

	            Object obj = parser.parse(new FileReader(path));

	            JSONObject jsonObject = (JSONObject) obj;
	            System.out.println(jsonObject);

	        }
	            catch (FileNotFoundException e) {
	                e.printStackTrace();
	            } catch (IOException e) {
	                e.printStackTrace();
	            } catch (ParseException e) {
	                e.printStackTrace();
	            }

	    }

	}

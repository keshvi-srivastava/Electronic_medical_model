package com.ask.be.dao;

import java.util.logging.Logger;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.util.JSON;

public class mongoCreateDB {

	private final static Logger LOGGER = Logger.getLogger(mongoCreateDB.class.getName());
	
	public static void store(String data, String dbName, String collectionName)
	{
		
		
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		@SuppressWarnings("deprecation")
		DB database = mongoClient.getDB(dbName);
		DBCollection collection = database.getCollection(collectionName);
        DBObject JsonObject = (DBObject) JSON.parse(data);
        LOGGER.info(JsonObject.toString());
        collection.insert(JsonObject);
        
	}
}


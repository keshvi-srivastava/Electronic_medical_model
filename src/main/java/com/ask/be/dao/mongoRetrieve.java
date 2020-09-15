package com.ask.be.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.util.JSON;

public class mongoRetrieve {

private final static Logger LOGGER = Logger.getLogger(mongoCreateDB.class.getName());
	
	public static List<DBObject> retrieve(String dbName, String collectionName, String key, String value)
	{
		
		MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://127.0.0.1:27017"));
		@SuppressWarnings("deprecation")
		DB database = mongoClient.getDB(dbName);
		DBCollection collection = database.getCollection(collectionName);
		BasicDBObject Query = new BasicDBObject();
		Query.put(key, value);
		//DBCursor cursor = collection.find(Query);
		List<DBObject> obj = collection.find(Query).toArray();
		LOGGER.info(obj.toString());
		return(obj);
		
        
	}
}

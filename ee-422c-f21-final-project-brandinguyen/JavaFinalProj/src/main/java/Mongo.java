import org.bson.BasicBSONObject;
import org.bson.Document;
import org.json.JSONObject;

import com.mongodb.*;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

import java.util.*;

public class Mongo {
    static MongoClient mongoClient;
    static MongoDatabase database;
    public void setUpConnection(){
        ConnectionString connectionString = new ConnectionString("mongodb+srv://master:lemonade@finalproject.hcjw2.mongodb.net/FinalProject?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connectionString)
                .build();
        mongoClient = MongoClients.create(settings);
        database = mongoClient.getDatabase("FinalProject");
    }

    //Create document from String array that has a field for username, password, and role
    private static Document makeDocument(String[] member) {
        return new Document("username", member[0])
                .append("password", member[1])
                .append("role", member[2]);
    }

    //Create document for team member, insert into collection
    private static void addCollection(String[][] team, MongoCollection<Document> coll) {
        for(String[] member : team) {
            Document memberDoc = makeDocument(member);
            coll.insertOne(memberDoc);
        }
    }

    public void create(MongoCollection<Document> collection){
        String[][] Gteam = {{"Ayaan", "1234", "UGTA"}, {"Rishi", "1234", "UGTA"}, {"Ishaan", "1234", "UGTA"}, {"Akarsh", "1234", "UGTA"}};
        addCollection(Gteam, collection);
    }

    public static void main(String[] args)
    {
        Mongo mongoInstance = new Mongo();
        mongoInstance.setUpConnection();
        mongoInstance.create(database.getCollection("Item"));
    }

}

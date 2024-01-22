package telran.aws.sensors.dto;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SensorData {
	long id;
	double value;
	
public SensorData(long id, double value) {
		this.id = id;
		this.value = value;
	}
public SensorData(String json) throws ParseException {
	JSONParser parser = new JSONParser();
	JSONObject mapObject = (JSONObject) parser.parse(json);
	id = (long) mapObject.get("id");
	value = (double)mapObject.get("value");
}
public long getId() {
	return id;
}
public double getValue() {
	return value;
}
@Override
public String toString() {
	HashMap<String, Object> mapObject = new HashMap<>();
	return JSONObject.toJSONString(mapObject);
}
}

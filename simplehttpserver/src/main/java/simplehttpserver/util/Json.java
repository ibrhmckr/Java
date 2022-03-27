package simplehttpserver.util;

public class Json {

	private static ObjectMapper myObjectMapper;
	
	private sstatic ObjectMapper defaultObjectMapper() {
		ObjectMapper om = new ObjectMapper();
		om.configure(DesrializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		return om;
	}
	
	
	
	public static JsonNode parse(string JsonSrc) {
		return myObjectMapper.readTree(JsonSrc);
		
	}// end of JsonNode
	
	public static <A> fromJson(JsonNode node, Class <A> clazz) throws JsonProcessingException{
		
	}// end of fromJson
	
	public static JsonNode toJson(Object obj) {
		return myObjectMapper.valueToTree(obj);
	}
	
	public static String stringfy(JsonNode node) throws JsonProcessingException {
		return generateJson(node,false);
		
	}// end of stringfy
	public static String stringfy(JsonNode node) throws JsonProcessingException {
		return generateJson(node,true);
		
	}// end of stringfy
	
	private static String generateJson(Object o, boolean pretty) throws JsonProcessingException {
		ObjectWriter objectWriter = myObjectMapper.writer();
		if(pretty) {
			objectWriter = objectWriter.with(SerializationFeature.INDENT_OUTPUT);
		}
		return objectWriter.writeValueAsString(o);
	}
	
	
	
	
		
	}// end of ObjectMapper
	
}

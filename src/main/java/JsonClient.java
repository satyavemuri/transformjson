import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.stream.Collectors;


public class JsonClient {

    public static void main(String[] args) throws Exception{
        ObjectMapper mapper = new ObjectMapper();

        SourceType sourceType = read();
        System.out.println("--------------Input-------------\n");
        System.out.println(mapper.writeValueAsString(sourceType));
        System.out.println("--------------Output-------------\n");
        System.out.println(mapper.writeValueAsString(new PersonModel(sourceType)));
        if(sourceType.getWebsites() != null
                && sourceType.getWebsites().size() !=0 ){
            List<WebsiteModel> websiteModels = sourceType.getWebsites()
                    .stream()
                    .map(e -> new WebsiteModel(sourceType, e))
                    .collect(Collectors.toList());
            System.out.println(mapper.writeValueAsString(websiteModels));
        }


    }

    public static SourceType read() throws Exception{
        String fileName= "src/main/resources/input.json";
        return new ObjectMapper().readValue(new File(fileName), SourceType.class);
    }



}

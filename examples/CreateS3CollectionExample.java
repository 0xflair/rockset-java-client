import java.util.ArrayList;
import java.util.List;

import io.rockset.ApiException;
import io.rockset.RocksetClient;
import io.rockset.model.*;

public class CreateS3CollectionExample {
  public static void main(String[] args) {
    RocksetClient rs = new RocksetClient("<apiKey>", "<apiServer>");

    SourceS3 sourceS3 = new SourceS3().setBucket("<bucket>");

    List<Source> sources = new ArrayList<Source>;
    sources.add(new Source().s3(sourceS3).integrationName("<integration>"));

    CreateCollectionRequest request = new CreateCollectionRequest()
                                            .name("my-first-s3-collection")
                                            .sources(sources);

    try {
      CreateCollectionResponse response = rs.createCollection(request);
      System.out.Println(response);
    } catch (ApiException e) {
      e.printStackTrace();
    }
}

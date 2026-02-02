package tw.com.colatour.datafeed.dto;

import com.google.cloud.storage.Blob;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BucketFile {

    private String fileName;
    private Long fileSize;

}

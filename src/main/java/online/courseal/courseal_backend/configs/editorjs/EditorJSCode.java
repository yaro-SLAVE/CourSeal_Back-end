package online.courseal.courseal_backend.configs.editorjs;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import online.courseal.courseal_backend.configs.editorjs.data.EditorJSCodeData;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class EditorJSCode extends EditorJSBlock{
    private EditorJSCodeData data;
}

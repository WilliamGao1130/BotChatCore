package org.bluepowerrobotics.botchatcore.config;

import org.bluepowerrobotics.botchatcore.storage.AdaptersStorage;

public class AdaptersConfig {
    public class AdapterData{
        private String RequestBody;

        private String ResponseBody;

        public AdapterData(String RequestBody, String ResponseBody) {
            this.RequestBody = RequestBody;
            this.ResponseBody = ResponseBody;
        }

        public String getRequestBody() {
            return RequestBody;
        }

        public String getResponseBody() {
            return ResponseBody;
        }
    }
    private static AdaptersConfig instance;
    private AdaptersStorage adaptersStorage;
    private AdaptersConfig(AdaptersStorage adaptersStorage) {
        this.adaptersStorage = adaptersStorage;
    }
    public AdaptersConfig setInstance(AdaptersStorage adaptersStorage){
        instance = new AdaptersConfig(adaptersStorage);
        return instance;
    }
    public static AdaptersConfig getInstance() {
        if(instance == null){
            throw new RuntimeException("AdaptersConfig instance is null, call setInstance first.");
        }else{
            return instance;
        }
    }
    public boolean exist(String modelProvider){
        return adaptersStorage.exist(modelProvider);
    }
    public String getRequestBody(String modelProvider){
        return adaptersStorage.get(modelProvider).getRequestBody();
    }
    public String getResponseBody(String modelProvider){
        return adaptersStorage.get(modelProvider).getResponseBody();
    }
}

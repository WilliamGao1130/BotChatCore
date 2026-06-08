package org.bluepowerrobotics.botchatcore.storage;

import org.bluepowerrobotics.botchatcore.config.AdaptersConfig;

public interface AdaptersStorage {
    public boolean exist(String provider);
    public AdaptersConfig.AdapterData get(String provider);
}

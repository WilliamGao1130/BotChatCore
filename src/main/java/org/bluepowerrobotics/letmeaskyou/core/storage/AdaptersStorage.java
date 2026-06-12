package org.bluepowerrobotics.letmeaskyou.core.storage;

import org.bluepowerrobotics.letmeaskyou.core.config.AdaptersConfig;

public interface AdaptersStorage {
    public boolean exist(String provider);
    public AdaptersConfig.AdapterData get(String provider);
}

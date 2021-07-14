package com.tutorial.strategy.firstSample;

import org.apache.commons.codec.digest.DigestUtils;

public class SHA256Hash implements HashStrategy {
    @Override
    public byte[] hash(String raw) {
        return DigestUtils.sha256(raw);
    }
}

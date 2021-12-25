package com.bytelegend;

import static com.github.hcsp.test.helper.ProjectSourceFileReader.readAsString;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        a();
    }

    public static void a() throws IOException {
        b();
    }

    public static void b() throws IOException {
        c();
    }

    public static void c() throws IOException {
        d();
    }

    public static String d() throws IOException {
        // Please set a breakpoint here to capture the value of result
        String result = DigestUtils.md5Hex(readAsString(Main.class).replaceAll("\\s", ""));
        return result;
    }
}

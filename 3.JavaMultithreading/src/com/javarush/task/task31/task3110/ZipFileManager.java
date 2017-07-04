package com.javarush.task.task31.task3110;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Алексей on 28.06.2017.
 */
public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }

    public void createZip(Path source) throws Exception {
        ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile));

        ZipEntry entry = new ZipEntry(source.toFile().getName());
        zipOutputStream.putNextEntry(entry);
        //addNewZipEntry(zipOutputStream, source.getParent(), source.getFileName());

    }
}

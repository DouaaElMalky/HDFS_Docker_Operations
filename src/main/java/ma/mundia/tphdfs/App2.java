package ma.mundia.tphdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class App2 {
    public static void main(String[] args) throws IOException {
        Configuration conf = new Configuration();
        conf.set("fs.defaultFS", "hdfs://namenode:8020");
        FileSystem fs = FileSystem.get(conf);
        Path path = new Path("/file2.txt");
        FSDataOutputStream fsdos = fs.create(path);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fsdos));
        bw.write("Bonjour \n");
        bw.write("Cours HDFS \n");
        bw.write("Fin du fichier \n");
        bw.close();
        fs.close();

    }
}

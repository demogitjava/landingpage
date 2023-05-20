
package de.jgsoftware.landingpage.config.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import java.net.*;
import java.io.*;
import java.nio.file.Files;
import java.util.zip.*;
import static org.apache.commons.io.IOUtils.copy;



@ShellComponent
public class shellcommands {



    @ShellMethod("start h2 server --->  start h2 database")
    public String startdatabase(String database) throws IOException
    {


        return "";
    }



    @ShellMethod("install h2 databases from github with type command --->  h2demodatabase")
    public String h2demodatabase() {
        System.out.print("install databases" + "\n");
        File path = new File(System.getProperty("user.home"));


        /*
              path h2 database
              https://github.com/demogitjava/demodatabase/raw/master/zip_h2_db/landingpage/master.zip

              -> master.zip
              - demodb.mv.db
              - mawi.mv.db
              - shopdb.mv.db
        */

        int BUFFER = 2048;


        /*
                load file from internet to disk
         */
        try {
            URL url = new URL("https://github.com/demogitjava/demodatabase/raw/master/zip_h2_db/landingpage/master.zip");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            InputStream in = connection.getInputStream();
            FileOutputStream out = new FileOutputStream(path + "/master.zip");
            copy(in, out, 1024);

            in.close();
            out.close();



            /*
                unzip file to
                / demodatabase-master
             */
            ZipInputStream zipIn = new ZipInputStream(new FileInputStream(path + "/" + "master.zip"));
            ZipEntry entry = zipIn.getNextEntry();
            // iterates over entries in the zip file
            while (entry != null) {

                String filePath = File.separator + entry.getName();
                if (!entry.isDirectory()) {
                    // if the entry is a file, extracts it
                    extractFile(zipIn, filePath);
                } else {
                    // if the entry is a directory, make the directory
                    File dir = new File(filePath);
                    dir.mkdirs();
                }
                zipIn.closeEntry();
                entry = zipIn.getNextEntry();
            }
            zipIn.close();


        } catch(Exception e)
        {
            System.out.print("Fehler " + e);
        }




       /*
                copy files to the directory of the user
                like /root
        */
        //Files.copy("/demodatabase-master/demodb.mv.db", path + "/" + "demodb.mv.db");


        try {

            // copy demodatabses to user path  ----> like root


            // demo
            String demodb = path + "/"+ "demodb.mv.db";
            if(demodb.isEmpty())
            {
                System.out.print("folder demodatabase not exit please type command again");
            }
            else {
                copyFile(new File("/demodb.mv.db"), new File(path + "/"+ "demodb.mv.db"));


            }

            // mawi
            String mawi = path + "/"+ "mawi.mv.db";
            if(mawi.isEmpty())
            {
                System.out.print("folder demodatabase not exit please type command again");
            }
            else {
                copyFile(new File("/mawi.mv.db"), new File(path + "/"+ "mawi.mv.db"));
            }


            // shopdb.mv.db
            String shopdb = path + "/"+ "shopdb.mv.db";
            if(mawi.isEmpty())
            {
                System.out.print("folder demodatabase not exit please type command again");
            }
            else {
                copyFile(new File("/shopdb.mv.db"), new File(path + "/"+ "shopdb.mv.db"));
            }


        } catch (IOException e) {
            e.printStackTrace();
        }





        return "installed";
    }

    // 192.168.178.4	f713f62510c9
    @ShellMethod("install hosts ---> ihost")
    public String ihosts()
    {

        String stresolv = new String("host installed");

        File f = new File("/etc/hosts");
        try
        {

            FileWriter fileWriter = new FileWriter(f);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print("192.168.178.4 de_landingapge" + "\n");

            printWriter.close();
        } catch (Exception e)
        {
            System.out.print("Fehler " + e);
        }
        return stresolv;
    }

    @ShellMethod("install resolvconf ---> iresolvconf")
    public String iresolvconf()
    {
        String stresolv = new String("resolvconf installed");

        File f = new File("/etc/resolv.conf");
        try
        {

            FileWriter fileWriter = new FileWriter(f);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print("search demogitjava freewebshop free landingpage" + "\n");
            printWriter.print("nameserver 208.67.222.222" + "\n");
            printWriter.print("nameserver 208.67.220.220" + "\n");
            printWriter.print("nameserver 208.67.220.222" + "\n");
            printWriter.print("ameserver 208.67.222.220" + "\n");
            printWriter.print("options ndots:0" + "\n");

            printWriter.close();
        } catch (IOException e)
        {
            System.out.print("Fehler " + e);
        }
        return stresolv;
    }

    private static void copyFile(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath());
    }

    private void extractFile(ZipInputStream zipIn, String filePath) throws IOException
    {
        File path = new File(System.getProperty("user.home"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        byte[] bytesIn = new byte[2048];
        int read = 0;
        while ((read = zipIn.read(bytesIn)) != -1) {
            bos.write(bytesIn, 0, read);
        }
        bos.close();
    }


}
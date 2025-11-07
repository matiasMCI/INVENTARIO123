package org.biginventory;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

public class JSONUtiles {


    // Guardar JSON con extension .txt
    public static void uploadJSONTxt(JSONArray jsonArray, String archive){
        try{
            BufferedWriter salida = new BufferedWriter(new FileWriter(archive+".txt"));
            salida.write(jsonArray.toString(4));
            salida.flush();
            salida.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void uploadJSONTxt(JSONObject jsonObject, String archive){
        try{
            BufferedWriter salida = new BufferedWriter(new FileWriter(archive+".txt"));
            salida.write(jsonObject.toString(4));
            salida.flush();
            salida.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static String downloadJSON(String archive){
        StringBuilder contenido = new StringBuilder();
        String lectura= "";
        try
        {
            BufferedReader entrada = new BufferedReader(new FileReader(archive+".txt"));
            while((lectura = entrada.readLine())!=null){
                contenido.append(lectura);
            }
            entrada.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }


        return contenido.toString();
    }

}

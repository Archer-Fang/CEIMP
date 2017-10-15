package org.obsidian.ceimp.util;

import org.apache.log4j.Logger;

import java.io.File;

/**
 * Created by BillChen on 2017/10/15.
 */
public class DeleteUtil {

    private Logger logger = Logger.getLogger(this.getClass());

    private static final DeleteUtil instance = new DeleteUtil();

    private DeleteUtil(){}

    public static DeleteUtil getInstance(){
        return instance;
    }

    public void delete(String inputUrl){
        System.out.println(inputUrl);
        File file = new File(inputUrl);
        if(file.exists() && file.isFile()){
            file.delete();
        }
    }
}
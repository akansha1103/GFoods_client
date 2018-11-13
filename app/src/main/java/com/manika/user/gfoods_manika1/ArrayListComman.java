package com.manika.user.gfoods_manika1;

import java.util.ArrayList;

/**
 * Created by user on 29-09-2018.
 */

public class ArrayListComman {


        private static ArrayListComman obj1;
        private ArrayList<String> arr;
        private String user;
        private String contact;
        //private ArrayListCommon obj1;

        private ArrayListComman()
        {
            arr=new ArrayList<String>();
            user="";
            contact="";

        }
        public static ArrayListComman getInstance()
        {
            if(obj1==null)
            {
                obj1=new ArrayListComman();

            }
            return  obj1;
        }
        public ArrayList<String> getList(){
            return this.arr;
        }

        public void setName(String n)
        {
            this.user=n;
        }
        public String getName(){
        return this.user;
    }

    public void setContact(String n1)
    {
        this.contact=n1;
    }
    public String getContact(){
        return this.contact;
    }

    }



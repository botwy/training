package com.botwy.training;

import java.io.IOException;

public class MainException {


        public static void main (String...args) {
          int result = testMethod();
          System.out.println(result);
        }

        public static int testMethod () {
           /* try {return 42;}
            catch(Exception e){}
            finally {return 111;}
*/
            try {
                throw new IOException("something wrong");
            } catch (IOException e) {
                throw new RuntimeException("problem",e);
            } finally {
                return 111;
            }
        }
    }

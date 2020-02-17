package com.google.www.util;

public class Consult {
	
	public static Consult newInstance(){
        return new Consult();
    }
	
	public String generateActualSql(String consult, String... parameters) {
        String[] parts = consult.split("\\*");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            String part = parts[i];
            sb.append(part);
            if (i < parameters.length) {
                sb.append((parameters[i]));
            }
        }
        return sb.toString();
    }

  
}

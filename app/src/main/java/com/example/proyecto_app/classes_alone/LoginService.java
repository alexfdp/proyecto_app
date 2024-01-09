package com.example.proyecto_app.classes_alone;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.util.Log;


public class LoginService {

    //    public static void Auth(Context context, String usuario, String contrasena) {
//        StringRequest postRequest = new StringRequest(Request.Method.POST, ApiGeneral.apiURL + "/auth",
//                response -> {
//                    try {
//                        JSONObject jsonObject = new JSONObject(response);
//                        String token = jsonObject.getString("token");
//                        Log.d(TAG, "Token generado por API: " + token);
//                    } catch (Exception e) {
//                        Log.d(TAG, "Error al convertir json: " + e.getMessage());
//                        e.printStackTrace();
//                    }
//                },
//                error -> {
//                    Log.d(TAG, "Error de consulta: ");
//                    error.printStackTrace();
//                }) {
//            @Override
//            protected Map<String, String> getParams() {
//                Map<String, String> params = new HashMap();
//                params.put("usuario", usuario);
//                params.put("contrasena", contrasena);
//                return params;
//            }
//        };
//        Volley.newRequestQueue(context).add(postRequest);
//    }
    public static void Auth(Context context, String usuario, String contrasena) {

    }
}

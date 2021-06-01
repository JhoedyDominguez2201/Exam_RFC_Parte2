package com.example.exam_rfc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinner_Dia = findViewById<Spinner>(R.id.spinner_Dia)
        val lista_Dia =  listOf("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31")
        val adaptador_Dia = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista_Dia)
        spinner_Dia.adapter = adaptador_Dia

        val spinner_Mes = findViewById<Spinner>(R.id.spinner_Mes)
        val lista_Mes =  listOf("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre")
        val adaptador_Mes = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista_Mes)
        spinner_Mes.adapter = adaptador_Mes

        val spinner_Año = findViewById<Spinner>(R.id.spinner_Año)
        val lista_Año =  listOf("1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2016","2017","2018","2019","2020","2021")
        val adaptador_Año = ArrayAdapter(this,android.R.layout.simple_spinner_item,lista_Año)
        spinner_Año.adapter = adaptador_Año



    }
}
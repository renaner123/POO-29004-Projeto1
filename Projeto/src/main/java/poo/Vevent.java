package poo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Vevent {

    private String sumarry;
    private UUID uid;
    private String dtstamp;
    private String dtstart;
    private String dtend;
    private String location;
    //opcionais
    private String rrule;
    private ArrayList<String> exdate = new ArrayList();
    private ArrayList<String> eventos = new ArrayList();
    private static HashMap<String, ArrayList<String>> eventos_uid = new HashMap<String, ArrayList<String>>();

    public Vevent(String sumarry, UUID uid, String dtstamp, String dtstart, String dtend, String location) {

    }

    public Vevent(String sumarry, UUID uid, String dtstamp, String dtstart, String dtend, String location, String rrule) {

    }

    public Vevent(String sumarry, UUID uid, String dtstamp, String dtstart, String dtend, String location, String rrule, ArrayList<String> exdate) {
    }

    public Vevent() {

    }

    public String getSumarry() {
        return sumarry;
    }


    public boolean alterarSumarry(UUID u, String summary) {
      return true;
    }

    public UUID getUid() {
        return uid;
    }


    public String getDtstamp() {
        return dtstamp;
    }

    public boolean alterarDtstamp(UUID u, String stamp) {
        return true;
    }

    public String getDtstart() {
        return dtstart;
    }

    public boolean alterarDtstart(UUID u, String start) {
       return true;
    }

    public String getDtend() {
        return dtend;
    }

    public boolean alterarDtend(UUID u, String end) {
       return true;
    }

    public String getLocation() {
        return location;
    }

    public boolean alterarLocation(UUID u, String location) {
       return true;
    }

    public String getRrule() {
        return rrule;
    }

    public boolean alterarRrule(UUID u, String rrule) {
        return true;
    }


    public ArrayList<String> getExdate() {
        return exdate;
    }

    public ArrayList<String> getEventos() {
        return this.eventos;
    }

    public  HashMap<String, ArrayList<String>> getHashuid(){
        return eventos_uid;
    }

    public boolean removeEvent(UUID uid) {
        return true;
    }
}
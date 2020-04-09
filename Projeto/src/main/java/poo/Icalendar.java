package poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Icalendar {

    private Vcalendar vcalendar;
    private Vevent vevent;

    private HashMap<String, ArrayList<String>  > calendar = new HashMap<String, ArrayList<String>>();
    private ArrayList<String> valores = new ArrayList() ;

    public Icalendar(String proID){
        this.vcalendar = new Vcalendar(proID);
    }
    public Icalendar(){
        this.vcalendar = new Vcalendar();
    }


    public boolean addEvent(String sumarry, UUID uid, String dtstamp, String dtstart, String dtend, String location) {
        calendar = this.vcalendar.getvCalendar();
        if((this.validaData(this.converteData(dtstamp)) && this.validaData(this.converteData(dtstart)) && this.validaData(this.converteData(dtend))) == true) {
            for (Map.Entry<String, ArrayList<String>> elemento : this.calendar.entrySet()) {
                if (elemento.getKey().equals(this.getProid())) {
                    vevent = new Vevent(sumarry, uid, this.converteData(dtstamp), this.converteData(dtstart), this.converteData(dtend), location);
                    elemento.setValue(this.vevent.getEventos());
                }
            }

            return true;
        }else{
            return false;
        }
    }
    public boolean addEvent(String sumarry, UUID uid, String dtstamp, String dtstart, String dtend, String location, String rrule) {
        calendar = this.vcalendar.getvCalendar();

        if((this.validaData(this.converteData(dtstamp)) && this.validaData(this.converteData(dtstart)) && this.validaData(this.converteData(dtend)))&&this.validaRrule(rrule) == true) {
            for (Map.Entry<String, ArrayList<String>> elemento : this.calendar.entrySet()) {
                if (elemento.getKey().equals(this.getProid())) {
                    vevent = new Vevent(sumarry, uid, this.converteData(dtstamp), this.converteData(dtstart), this.converteData(dtend), location, rrule);
                    elemento.setValue(this.vevent.getEventos());
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public boolean addEvent(String sumarry, UUID uid, String dtstamp, String dtstart, String dtend, String location, String rrule, ArrayList<String> exdate) {
        calendar = this.vcalendar.getvCalendar();
        if((this.validaData(this.converteData(dtstamp)) && this.validaData(this.converteData(dtstart)) && this.validaData(this.converteData(dtend)))&&this.validaRrule(rrule) == true) {
            for (Map.Entry<String, ArrayList<String>> elemento : this.calendar.entrySet()) {
                if (elemento.getKey().equals(this.getProid())) {
                    vevent = new Vevent(sumarry, uid, this.converteData(dtstamp), this.converteData(dtstart), this.converteData(dtend), location, rrule, this.converteExdate(exdate));
                    elemento.setValue(this.vevent.getEventos());
                }
            }
            return true;
        }else{
            return false;
        }
    }

    public String getProid(){
        return this.vcalendar.getProID();
    }

    public String getSumarry() {
        return vevent.getSumarry();
    }

    public boolean alterarSumarry(UUID u, String summary) {
        return this.vevent.alterarSumarry(u,summary);
    }

    public UUID getUid() {
        return this.vevent.getUid();
    }

    public String getDtstamp() {
        return this.vevent.getDtstamp();
    }

    public boolean alterarDtstamp(UUID u, String stamp) {
        if(this.validaData(stamp)==true) {
            return this.vevent.alterarDtstamp(u, stamp);
        }else{
            return false;
        }
    }

    public String getDtstart() {
        return this.vevent.getDtstart();
    }

    public boolean alterarDtstart(UUID u, String start) {
        if(this.validaData(start)==true) {
            return this.vevent.alterarDtstart(u, start);
        }else{
            return false;
        }
    }

    public String getDtend() {
        return this.vevent.getDtend();
    }

    public boolean alterarDtend(UUID u, String end) {
        if(this.validaData(end)==true) {
            return this.vevent.alterarDtend(u, end);
        }else{
            return false;
        }
    }

    public String getLocation() {
        return this.vevent.getLocation();
    }

    public boolean alterarLocation(UUID u, String location) {
        return this.vevent.alterarLocation(u,location);
    }

    public String getRrule() {
        return this.vevent.getRrule();
    }

    public boolean alterarRrule(UUID u, String rrule) {
        if(this.validaRrule(rrule)==true) {
            return this.vevent.alterarRrule(u, rrule);
        }else{
            return false;
        }

    }

    public double getVersion(){
        return this.vcalendar.getVersion();
    }

    public void getCalendar(){

    }

    public boolean validaData(String date){
        return true;
    }

    private String converteData(String date){
        return "";
    }

    public boolean validaRrule(String n){
       return true;

    }

    public boolean removeEvent(UUID sum){
        return this.vevent.removeEvent(sum);
    }

    private ArrayList<String> converteExdate(ArrayList<String> a){
        ArrayList<String> aux = new ArrayList<>();
        return aux;
    }



}

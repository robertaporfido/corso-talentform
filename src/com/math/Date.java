package com.math;

import java.time.*;
import java.time.temporal.*;


public class Date {

	public static void main(String[] args) {
		
//		LocalDate today = LocalDate.now();
//	        System.out.println(today);
//
//	        LocalDate Five5 = LocalDate.of(2022, 5, 5);
//	        System.out.println(Five5);
//
//	        LocalDate May5th = LocalDate.of(2022, Month.MAY, 5);
//	        System.out.println(May5th);
//
//	        LocalDate Day125 = LocalDate.ofYearDay(2022, 125);
//	        System.out.println(Day125);
//
//	        LocalDate May5 = LocalDate.parse("2022-05-05");
//	        System.out.println(May5);
//
//	        System.out.println(May5.getYear());
//	        System.out.println(May5.getMonth());
		
		//Crea e stampa una data: 1 gennaio 2025.
		
		LocalDate data = LocalDate.of(2025, 1, 1);
		System.out.println(data);
		
		//Aggiungi 30 giorni alla data corrente e stampa la nuova data.
		
		LocalDate oggi = LocalDate.now();
		LocalDate futuro = oggi.plusDays(30);
		System.out.println(futuro);
		
		//Stampa il numero di giorni tra oggi e il 25 dicembre 2025.
		
		LocalDate today = LocalDate.now();
		LocalDate natale = LocalDate.of(2025,12, 25 );
		long giorni = ChronoUnit.DAYS.between(today, natale);
		System.out.println("i giorni fino a natale sono "+ giorni);
		
		//Controlla se il 1 gennaio 2000 è una data passata.
		
		LocalDate oggiOggi = LocalDate.now();
		LocalDate dataTestare = LocalDate.of(2020, 1, 1);
		boolean dataNelPassato = dataTestare.isBefore(oggiOggi);
		System.out.println(dataNelPassato);
		
		//Stampa l’anno, il mese e il giorno dalla data di oggi.
		
		LocalDate newToday = LocalDate.now();
		System.out.println("anno " + newToday.getYear());
		System.out.println("mese "+ newToday.getMonthValue());
		System.out.println("giorno "+ newToday.getDayOfMonth());
		
		//Controlla se l’anno della data odierna è bisestile.
		
		boolean bisestile = oggi.isLeapYear();
		System.out.println("l'anno corrente è bisestile? " + bisestile);
		
		//Dalla data di nascita 2000-04-15, calcola l’età attuale.
		
		LocalDate dataNascita = LocalDate.of(1998, 05, 11);
		LocalDate newOggi = LocalDate.now();
		Period eta = Period.between(dataNascita, newOggi);
		System.out.println("hai età "+ eta.getYears());
		
		//stampa ora attuale più 2.30h
       
		LocalDateTime adesso = LocalDateTime.now();
        LocalDateTime somma = adesso.plusHours(2).plusMinutes(30);
        System.out.println("ora attuale " + adesso + " ora aggiunta " + somma);
        
        //Calcola i minuti tra 14:15 e 16:45.
        long minuti = ChronoUnit.MINUTES.between(LocalTime.of(14,15),LocalTime.of(16,45));
        System.out.println("minuti trascorsi " +  minuti);
        
      //Trova il numero di giorni tra 2025-01-01T00:00 e la data corrente
		
      		LocalDateTime dataOra = LocalDateTime.of(2025, 01, 01, 0, 0);
      		LocalDateTime oggiOra = LocalDateTime.now();
      		long gio = ChronoUnit.DAYS.between(dataOra, oggiOra);
      		System.out.println("Il numero di giorni tra 2025-01-01 e la data corrente è: " + gio);
        
		//Mostra l’ora attuale a Tokyo usando ZonedDateTime.
      		
      	ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
      	System.out.println("Ora di Berlino "+ tokyo.toLocalTime());
		
//      Dato un giorno qualsiasi, trova il giorno lavorativo successivo (lunedì-venerdì).
        LocalDate oggi1 = LocalDate.of(2025, 07, 8);
        do{
        	oggi1 = oggi.plusDays(1);
        }while(oggi.getDayOfWeek() == DayOfWeek.SATURDAY || oggi1.getDayOfWeek() == DayOfWeek.SUNDAY);{
        	System.out.println("prossimo giorno lavorativo " + oggi1);
        	}
	        
	    //differenza tra roma e new york
        ZonedDateTime nowRome = ZonedDateTime.now(ZoneId.of("Europe/Rome"));
        ZonedDateTime nowNY   = nowRome.withZoneSameInstant(ZoneId.of("America/New_York"));
        
        long hoursDiff = ChronoUnit.HOURS.between(nowNY, nowRome);
        System.out.println("Differenza in ore: " + hoursDiff);
    }



	}



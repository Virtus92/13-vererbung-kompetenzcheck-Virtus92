# Vererbung - Kompetenzcheck

Implementiere ein Programm, dass Fahrzeuge verwaltet.

- Fahrzeug 
  - hat zumindest folgende Eigenschaften:
    - gehört zu einer Person/Firma
    - eine definierte Anzahl an Rädern
    - einen Tachostand
    - eine definierte Durchschnittsgeschwindigkeit

  - kann:
    - huppen
    - von A nach B fahren

Als Fahrzeug gelten PKW, LKW und Fahrrad.

- PKW:
  - hat folgende Eigenschaften:
    - gehört zu einer Person/Firma
    - einen Tachostand
    - eine definierte Durchschnittsgeschwindigkeit
    - 4 Räder
    - einen Motor
    - eine bestimmte Anzahl an PS
    - bis zu 7 Sitzplätzen je nach Modell

  - kann:
    - huppen
    - von A nach B fahren
    - Vollgas fahren

- LKW:
  - hat folgende Eigenschaften:
    - gehört zu einer Person/Firma
    - einen Tachostand
    - mindestens 6 Räder
    - eine definierte Durchschnittsgeschwindigkeit
    - einen Motor
    - eine bestimmte Anzahl an PS
    - bis zu 3 Sitzplätzen je nach Modell
    - ev. einen Anhänger
    - eine bestimmte Menge an Ladegut (max. 10 To)

  - kann:
    - huppen
    - von A nach B fahren
    - Ladegut transportieren

Fahrrad:
  - hat folgende Eigenschaften:
    - gehört zu einer Person/Firma
    - einen Tachostand
    - eine definierte Durchschnittsgeschwindigkeit
    - 2 Räder
    - 1-2 Sitzplätzen
    - eine Klingel oder eine Hupe

  - kann:
    - huppen (auch mit der Klingel)
    - von A nach B fahren
    - von einem Menschen geschoben werden
    - von einem Menschen angetrieben werden

Lastenfahrrad:
  - hat folgende Eigenschaften:
    - gehört zu einer Person/Firma
    - einen Tachostand
    - eine definierte Durchschnittsgeschwindigkeit
    - mind. 2 Räder

  - kann:
    - huppen
    - von A nach B fahren
    - dasselbe wie ein Fahrrad
    - zusätzlich kann es Ladegut transportieren

Implementiere die entsprechenden Klassen. Überlege dir gut, ob und welche Klassen und Methoden als `abstract` definiert werden sollen.

Da die Ausgabe in der Konsole erfolgen soll, erfolgt huppen durch eine Konsolenausgabe. Auch das fahren erfolgt, indem eine Konsolenausgabe folgendes darstellt:
- Abfahrtsort und Abfahrtszeit (jetzt). Die Ausgabe von Datum/Zeit erfolgt im Format: *"JJJJ-MM-TT HH:mm:ss"*
- Dauer der Reise
- Ankunftsort und Ankunftszeit

In deinem Hauptprogramm erstellst du eine Liste mit verschiedensten Fahrzeugen. Anschließend lässt du alle Fahrzeuge von Linz nach Graz (220km), Linz nach Wien (180km), Wien nach Graz (200km) fahren und anschließend wieder retour. 

### Abnahmekriterien

- Die richtigen Klassen und Methoden sind als `abstract` deklariert und entsprechend in den Subklassen implementiert.
- Der:die Teilnehmer:in kann erklären, warum diese Klassen/Methoden als `abstract` deklariert wurden.
- Die Variablen-/Methoden-/Klassennamen sind aussagekräftig
- Der Code ist gut strukturiert (Siehe Clean Code)
- Der Code ist in GITHub eingecheckt

Zurück zur [Startseite](README.md)

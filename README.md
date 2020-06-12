![Ktor Logo](https://ktor.io/assets/images/ktor_logo.svg)
> Logo from https://www.jetbrains.com/

# Workshop Serverseitige Entwicklung mit Ktor
Der Workshop Serverseitige Entwicklung mit Ktor soll einen ersten Einblick in das Framework _Ktor_ geben. 
Bei Ktor handelt es sich um ein Framework zur Implementierung von asynchronen server- und clientseitigen Anwendungen, mit Hilfe der Programmiersprache _Kotlin_.
Während des Workshops sollen Teilnehmer in einem ersten Hands-on eine Server Komponente mit dem Framework Ktor und Kotlin als Programmiersprache umsetzen. 
Behandelt werden dabei vor allem die Implementierung von Routen und die Verarbeitung von Daten. 
Zur Unterstützung wird bereits eine Frontend Komponente zur Verfügung gestellt, um die umgesetzten Teile zu testen. 

## Vorbereitung

### Allgemein 

1. [Google Chrome](https://www.google.com/chrome/) installieren
2. Workshop Repository klonen `https://github.com/Dominikdeimel/ktor-workshop.git` 

### Backend

1. [IntelliJ IDE](https://www.jetbrains.com/de-de/idea/) installieren

2. Intellij starten

3. Unter `File` > `Settings` > `Plugins` nach _ktor_ suchen installieren

![](https://github.com/Dominikdeimel/ktor-workshop/blob/master/assets/plugin.png)

4. Den Ordner `tasks-workshop` in Intellij öffnen

5. Anwendung starten

![](https://github.com/Dominikdeimel/ktor-workshop/blob/master/assets/start.png)

![](https://github.com/Dominikdeimel/ktor-workshop/blob/master/assets/console.png)

**Falls die Anwendung nicht gestartet werden kann**

6. `Add Configuration` auswählen

7. Bei _Templates_ `Application` auswählen, bei _Main Class_ `io.ktor.server.netty.EngineMain` eintragen und bei _Use classpath of module_ `example` auswählen

8. Anwendung starten

### Frontend
1. In das Verzeichnis wechseln `cd frontend-workshop`

2. Dependencies installieren `npm install`

3. Anwendung starte `npm run serve`

Die Anwendung ist unter http://localhost:8080 verfügbar

![](https://github.com/Dominikdeimel/ktor-workshop/blob/master/assets/frontend.png)

Sollte der Text **Backend: Online** zu sehen sein, sind die Vorbereitungen abgeschlossen

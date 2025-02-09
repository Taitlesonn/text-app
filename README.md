<!DOCTYPE html>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Prosty Edytor Tekstowy w Java z JavaFX</title>
</head>
<body>
    <h1>Prosty Edytor Tekstowy w Java z JavaFX</h1>
    <p>Jest to prosty edytor tekstowy stworzony w języku Java z wykorzystaniem biblioteki JavaFX. Aplikacja pozwala na otwieranie, edytowanie oraz zapisywanie plików tekstowych. Edytor umożliwia także tworzenie wersji zapisanych plików, z których można cofnąć się do poprzednich stanów.</p>

    <h2>Wymagania</h2>
    <ul>
        <li>Java 17 lub nowsza</li>
        <li>JavaFX SDK 23.0.1 lub nowsza</li>
    </ul>

    <h2>Instalacja</h2>
    <ol>
        <li>Pobierz plik JAR <code>text.jar</code> z folderu <code>out</code>.</li>
        <li>Upewnij się, że masz zainstalowane JavaFX SDK i umieść je w odpowiednim folderze na swoim komputerze.</li>
        <li>Uruchom aplikację, wykonując następującą komendę:</li>
        <pre><code>java --module-path "C:\javafx-sdk-23.0.1\lib" --add-modules javafx.controls,javafx.fxml -jar text.jar</code></pre>
    </ol>

    <h2>Funkcjonalności</h2>
    <ul>
        <li><strong>Save</strong>: Zapisuje plik oraz tworzy listę wersji po prawej stronie ekranu.</li>
        <li><strong>Open File</strong>: Otwiera plik i również zapisuje jego wersję w historii.</li>
        <li>Możliwość cofania się do poprzednich wersji: Wystarczy kliknąć na dowolną wersję z listy po prawej stronie, aby przywrócić dany stan pliku.</li>
    </ul>

    <h2>Uwaga</h2>
    <p>Funkcja cofania działa tylko do wersji zapisanych po kliknięciu przycisku <strong>Save</>, ale nie obsługuje operacji cofania wstecz w trakcie edytowania.</p>

</body>
</html>

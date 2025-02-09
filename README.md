# Prosty Edytor Tekstowy w Java z JavaFX

## Opis

Jest to prosty edytor tekstowy stworzony w języku Java z wykorzystaniem biblioteki JavaFX. Aplikacja umożliwia otwieranie, edytowanie oraz zapisywanie plików tekstowych. Dodatkowo, edytor tworzy historię wersji zapisywanych plików, co pozwala na cofnięcie się do wcześniejszych stanów.

## Wymagania

- Java 17 lub nowsza
- JavaFX SDK 23.0.1 lub nowsza

## Instalacja i uruchomienie

1. Pobierz plik JAR `text.jar` znajdujący się w folderze `out`.
2. Upewnij się, że masz zainstalowane JavaFX SDK. Skonfiguruj ścieżkę do folderu `lib` w swoim systemie (w przykładzie jest to: `C:\javafx-sdk-23.0.1\lib`).
3. Uruchom aplikację, wykonując poniższą komendę w terminalu lub wierszu poleceń:

   ```bash
   java --module-path "C:\javafx-sdk-23.0.1\lib" --add-modules javafx.controls,javafx.fxml -jar text.jar

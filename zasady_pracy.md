Jak zacząć i jak operować w NetBeansie?
===============================================

1. Ściągnąć [NetBeans](https://netbeans.org/downloads/) i zainstalować
2. Sprawdzić konto na gicie, [dodać klucz SSH](https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/#platform-windows) jeśli nie masz. Wersja dla [Linuxa](https://help.github.com/articles/generating-a-new-ssh-key-and-adding-it-to-the-ssh-agent/#platform-linux)
3. Jeśli nie masz GitBash potrzebnego w powyższym punkcie dla Windowsa, [pobierz i zainstaluj](https://github.com/git-for-windows/git/releases/tag/v2.15.0.windows.1)

## Rozpoczynanie pracy z projektem w NetBeans:

- Uruchamiamy NetBeans
- `Team > Git > Clone`
- `Repository URL`: github.com:miczyg1395/gcode-editor.git
- Wypełniamy `username`: git
- Zaznaczamy `Private/Public Key` i wybieramy pliki z kluczem SSH (wpisujemy
  passphrase jeśli ustawiliśmy hasło przy generowaniu klucza)
- Zaznacz branch master i Twój własny branch
- Kliknij `Next`
- Wybierz branch na którym będziesz pracować (Checkout branch)

> Nie pracujemy na branchu master! Zanim przystąpisz do rpacy utwórz własny
> branch do pracy! Branch możesz utworzyć przez GUI w przeglądarce rozwijając
> blok Branch:master, wpisując w polu tekstowym nazwę brancha, aż pojawi się
> napis Create branch `nazwa brancha` from `master`

- Kliknij Finish

## Tworzenie projektu

- NetBeans powinien zeskanować w celu wyszukania projektów po zclonowaniu
  i zapyta czy utworzyć nowy projekt. Naciskamy `Create Project` w małym okienku
  i wybieramy opcję `Java Project with Existing Sources`
- Nadajemy jakąś nazwę projektowi (dowolna)
- Przy `Source Package Folders` naciskamy `Add Folder` i wskazujemy katalog `src`
  w folderze, do którego zclonowaliśmy repo. Naciskamy `Next`
- Na liście `Included Files` powinno znaleźć się cos takiego `<package_name>/<filename>.java`
  Lista powinna zawierać wszystkie pliki źródłowe z repozytorium. Naciskamy `Finish`

## Dokonywanie zmian

- Edytujemy kod i zapisujemy plik
- Warto podpatrzeć sobie zmiany jakie się dokonały `Team > Show Changes`
- `Team > Add`
- `Team > Commit`:
	- Jak często commitować? Nie za często i nie za rzadko. Commity powinny obejmować
	pewne funkcjonalności lub ograniczać się do jednego pliku
    - Jak tworzyć Commit message: Zalecam format:
    ```
    <nazwapliku_lub_funkcjonalność>: Dodano inicjalizację i wyświetlanie ramki głównej.

	Dodatkowy opis, który czasami może być potrzebny. Jeżeli czasem potrzeba wyjaśnienia.
    ```
    - Uzupełnić poprawnie `Author` i `Commiter`
- `Team > Remote > Push to Upstream` aby dokonać zmian w zdalnym repozytorium

## Zakończenie pracy

Kiedy już zakończycie pracę na swoim zadaniem, funkcjonalnością, tworzycie na
GitHubie Pull Request. Kiedy wejdziecie na swój branch w przeglądarce, będzie
widoczny guzik `Compare & Pull Request`. Nadajecie odpowiedni opis Pull Requesta
(najlepiej nazwa taska z Taiga.io) i dodajecie `miczyg1395` do `Reviewers`. Przeglądam
i weryfikuję poprawność kodu oraz zgłaszam uwagi oraz niezbędne poprawki. Kiedy
zaakceptuję waszą pracę, kod ląduje w głównym branchu master. Bierzecie nowe zadanie
z Taiga.io, tworzycie nowy branch i zaczynacie pracę ponownie.

## Nowe zadania

W przypadku, gdy skończycię pracę nad jednym zadaniem i przejdziecie na następne:

- `Team > Remote Pull from Upstream`
- `Team > Branch > Switch To Branch`
- Dokonujemy zmian w kodzie i powtarzamy procedurę opisaną [wyżej](#dokonywanie-zmian)
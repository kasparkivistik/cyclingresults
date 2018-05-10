#Cyclingresults

Eesolev rakendus on valminud õppeaine "Veebiteenused" raames. Teenus koosneb SOAP ja REST API-st,
mis on loodud Java Spring Boot raamistikus. Dokumentatsioonis käsitletakse SOAP ja REST API-sid eraldi moodulitena.

## Vajalikud tehnoloogiad

- IDE
- Gradle
- Brauser
- Apache Tomcat

## Käivitamine

```
$ git clone https://github.com/kasparkivistik/cyclingresults.git
$ cd cyclingresults
$ gradle genJaxb --genereerib WSDL järgi klassid
$ gradle bootRun
```

## Sisukord

1. [Teenuse struktuur](#Teenuse struktuur)
2. [SOAP API dokumentatsioon](#SOAP)
3. [REST API dokumentatsioon](#REST)

## Teenuse struktuur

Teenus koosneb kahest API-st. SOAP ja REST.
Teenusel on kaks põhiobjekti: _diploma_ (diplom) ja _competitor_ (võistleja).  
Objekt **Diplom** koosneb järgnevatest elementidest:  
- id,
- üritus (_event_),
- ürituse toimumisaeg (_timeOfEvent_),
- osaleja aeg (_time_),
- koht (_placement_),
- vanuseklass (_ageGroup_),
- võistleja (_competitor_)\
Objekt **Võistleja** koosneb järgnevatest elementidest:  
- id,
- nimi (_name_),
- isikukood (_personalCode_)

Kõik objektidega tehtavad operatsioonid on kasutatavad nii SOAP kui ka REST APIs. Teenuses kasutataske idemptsuse printsiipi, ehk iga päringuga on kohustuslik anda kaasa API token, ilma milleta päringut ei rahuldata.
Kui üldiselt API token antaks kaasa näiteks autoriseerimisel, on käesolevas projektis see _hardcodetud_ sisse tekstivälja "secrettoken123" nimel.
\
Kuna mõlemad APId kasutavad sama "andmebaasi", siis on nad seotud ühise _repositoryga_, mistõttu SOAP _service_ meetodid võtavad sisse sama objekti, mis REST API, aga väljastavad WSDLis määratud _Response_ objekti.
## SOAP



## REST

REST API on dokumenteeritud kasutades Swagger UId.
Swagger on kättesaadav [SIIN](http://localhost:8080/swagger-ui.html) pärast Spring Booti rakenduse käivitamist.\
Samuti on võimalik Swagger UIst näha teenuses kasutatud mudelite disaini (_Competitor_ ja _Diploma_ objekte).
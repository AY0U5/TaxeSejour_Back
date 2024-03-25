Feature: TaxeSejourAnnuelDetail

  Background:
    * call read('karate-config.js')
    * call read('db_cleaner.js')
    * url taxeSejourAnnuelDetailUrl
    * header Content-Type = 'application/json'

    * def postBody = read('TaxeSejourAnnuelDetailSave.json')
    * def FindAllSchema = read('TaxeSejourAnnuelDetailSchema.json')

  Scenario: Fail - GetByID Not Found

    * path 'id', 99999999
    * header Authorization = 'Bearer ' + adminToken
    * method GET
    * status 404
    * match response.length == 0



  Scenario: Fail - POST TaxeSejourAnnuelDetail without Body

    * path ''
    * header Authorization = 'Bearer ' + adminToken
    * method POST
    * status 400
    * match response.error == "Bad Request"



  Scenario: Fail - POST TaxeSejourAnnuelDetail without Authorization

    * path ''
    * header Authorization = 'Bearer unvalid'
    * request postBody
    * method POST
    * status 500



  Scenario: Fail - Save TaxeSejourAnnuelDetail with method PATCH

    * path ''
    * header Authorization = 'Bearer ' + adminToken
    * method PATCH
    * status 405
    * match response.error == "Method Not Allowed"

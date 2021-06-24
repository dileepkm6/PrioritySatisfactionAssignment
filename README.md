# Priority Satisfaction Rating application

In Priority Satisfaction Rating application there are different priortiy like connection,relationship,career and wealth etc. User can rates their priority with 1-5 (1-lowest 5-best)

## Features

- Admin can add as many Priority as required
- User can fetch all existing Priority
- User can give satisafaction rating on individual or multiple priority at a time

## Tech

- [SpringBooot](https://spring.io/projects/spring-boot) - spring framework!
- [Spring tool suite](https://spring.io/tools) - ide for developemnt 
- [Ibatis](https://ibatis.apache.org/) - Oobject Relational Mapping Tools



## Rest API Endpoints
- GET - http://localhost:8080/api/getAllPriorities
fetch all existing priory avalibale in database
```yaml
  Response:
[
    "Career",
    "Connection",
    "Relationships",
    "Wealth"
]
```
- GET - http://localhost:8080/api/getUserRating
 get user satisfaction rating for priorities
 request- userName in header
```yaml
response:
[
    {
        "priority": "Connection",
        "satisfactionRating": 0
    },
    {
        "priority": "Relationships",
        "satisfactionRating": 0
    },
    {
        "priority": "Career",
        "satisfactionRating": 0
    },
    {
        "priority": "Wealth",
        "satisfactionRating": 0
    }
]
```
- POST - http://localhost:8080/api/addPriority?priority=test
 add priority with admin user (dileep)
payload:
query param-
priority : name
in header:
userName: dileep
``` yaml
Response:
Priority is successFully added
```
- POST - http://localhost:8080/api/updateSatisfactionRating
- update satisfaction rating
payload:
in header:
userName: dileep
``` yaml
{
    "priorityEntityList": [
    {
        "priority": "Connection",
        "satisfactionRating": 5
    },
    {
        "priority": "Relationships",
        "satisfactionRating": 4
    },
    {
        "priority": "Career",
        "satisfactionRating": 0
    },
    {
        "priority": "Wealth",
        "satisfactionRating": 0
    }
]
}
```
``` yaml
Response:
successFully updated
```


 


   

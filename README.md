# transformjson

# --------------Input-------------

```{"first_name":"Sammy","last_name":"Shark","location":"Ocean","websites":[{"description":"work","social_media":[{"medialink":"twitter.com","Name":"Twitter"},{"medialink":"Orkut.com","Name":"Orkut"},{"medialink":"Googleplus.com","Name":"Googleplus"}],"WebsiteID":"125","URL":"https://www.digitalocean.com/"},{"description":"tutorials","social_media":[],"WebsiteID":"1898","URL":"https://www.digitalocean.com/community/tutorials"}],"PersonID":"1"}```

# --------------Output-------------

```{"personID":"1","first_name":"Sammy","last_name":"Shark","location":"Ocean"} <br>
[{"description":"work","PersonID":"1","WebsiteID":"125","URL":"https://www.digitalocean.com/"},{"description":"tutorials","PersonID":"1","WebsiteID":"1898","URL":"https://www.digitalocean.com/community/tutorials"}]```

# Meetup-Hubs-Kafka

Publish an event as shown below line by line.
```
{"utc_offset":3600000,
  "venue":{"country":"de",
  "city":"Munchen",
  "address_1":"Tal 8",
  "name":"Tegernseer Tal - Brauhaus",
  "lon":11.578209,"lat":48.13599},
  "rsvp_limit":0,
  "venue_visibility":"public",
  "visibility":"public",
  "maybe_rsvp_count":0,
  "description":"<p>Hi everyone,<\/p>\n<p>Lets get .....snip....",
  "mtime":1479116040446,
  "event_url":"https:\/\/www.meetup.com\/The-Munich-iOS-Developers-Meetup\/events\/2351501
  \/",
  "yes_rsvp_count":21,
  "payment_required":"0",
  "name":"Social drinks meetup",
  "id":"235150101",
  "time":1479232800000,
  "group":{"join_mode":"open",
  "country":"de",
  "city":"Munchen",
  "name":"The Munich iOS Developers Meetup",
  "group_lon":11.58,
  "id":10979402,
  "urlname":"The-Munich-iOS-Developers-Meetup",
  "category":{"name":"tech","id":34,"shortname":"tech"},
  "group_photo":{"highres_link":"http:\/\/photos1.meetupstatic.com\/photos
\/event\/8\/0\/0\/a\/highres_438692778.jpeg",
  "photo_link":"http:\/\/photos1.meetupstatic.com\/photos\/event\/8\/0\/0
\/a\/600_438692778.jpeg",
  "photo_id":438692778,
  "thumb_link":"http:\/\/photos1.meetupstatic.com\/photos\/event\/8\/0\/0
\/a\/thumb_438692778.jpeg"},
  "group_lat":48.14},
  "status":"upcoming"}
 ```
  Created Kafka Stream for the filtering. The first filters the output stream down to Germany. The second filters down the output to just Munich.

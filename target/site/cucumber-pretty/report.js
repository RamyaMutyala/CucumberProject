$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Discovery.feature");
formatter.feature({
  "line": 2,
  "name": "Discovery My Videos validations",
  "description": "",
  "id": "discovery-my-videos-validations",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Discovery"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Verify the videos added to favourites list appear with correct title and description",
  "description": "",
  "id": "discovery-my-videos-validations;verify-the-videos-added-to-favourites-list-appear-with-correct-title-and-description",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I launch Chrome browser and open url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I add video \"shark-week\" to favourites list",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I add video \"naked-and-afraid-xl\" to favourites list",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Navigate to my videos",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Verify the first video appear with correct title \"SHARK WEEK\" and description \"Television\u0027s longest running must-see summer TV event is filled with all things sharks! Shark Week 2019 will kick off Sunday, July 28.\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Verify the second video appear with correct title \"NAKED AND AFRAID XL\" and description \"A group of the best survival experts in the world take on an un-survivable situation: 40 days. 40 nights. No food, water or clothes. To…\"",
  "keyword": "And "
});
formatter.match({
  "location": "DicoveryStepDefinition.launh_browser_to_enter_url()"
});
formatter.result({
  "duration": 35005285536,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shark-week",
      "offset": 13
    }
  ],
  "location": "DicoveryStepDefinition.add_video_to_favourites_list(String)"
});
formatter.result({
  "duration": 345025873,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naked-and-afraid-xl",
      "offset": 13
    }
  ],
  "location": "DicoveryStepDefinition.add_video_to_favourites_list(String)"
});
formatter.result({
  "duration": 334171495,
  "status": "passed"
});
formatter.match({
  "location": "DicoveryStepDefinition.navigate_to_my_videos()"
});
formatter.result({
  "duration": 682924151,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SHARK WEEK",
      "offset": 50
    },
    {
      "val": "Television\u0027s longest running must-see summer TV event is filled with all things sharks! Shark Week 2019 will kick off Sunday, July 28.",
      "offset": 79
    }
  ],
  "location": "DicoveryStepDefinition.verify_video1_title_description(String,String)"
});
formatter.result({
  "duration": 8291946370,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NAKED AND AFRAID XL",
      "offset": 51
    },
    {
      "val": "A group of the best survival experts in the world take on an un-survivable situation: 40 days. 40 nights. No food, water or clothes. To…",
      "offset": 89
    }
  ],
  "location": "DicoveryStepDefinition.verify_video2_title_description(String,String)"
});
formatter.result({
  "duration": 90946948,
  "status": "passed"
});
formatter.after({
  "duration": 1073535569,
  "status": "passed"
});
});
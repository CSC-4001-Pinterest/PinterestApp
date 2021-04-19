# Guystrist

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)

## Overview
### Description
This app will resemble Pinterest, but it will be targeted towards a differnt audience. The app will mainly target African American Males. Since Pinterest is used often by women, we felt that it was fitting to make something similar for men. 

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category: Social Media/Lifestyle**
- **Mobile: This app will be made for mobile devices but, it could be developed to be use on Computers/Laptops. This app's functionality would not be limited to mobile devices, but it may be easier to navigate on a mobile device.**
- **Story: Analyzes users interests, can connect them to other users with similar choices. You create your own boards for your personal purposes, and share your ideas with others.**
- **Market: African-American Males.**
- **Habit: This app could be used as often or unoften as the user wanted depending on how deep their social life is, and what exactly they're looking for.**
- **Scope: First we would start with grouping people based on their interest. This could be a great counterpart to Interest.**

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* User will be able to upload a picture with a description as a "pin/board"
* User is able to log in 
* User will stay logged in after app is closed and reopen.
* users can see other users' "pins/boards"
* users can see their profile with their uploaded pin/board
* ...

**Optional Nice-to-have Stories**

* Can save other users' pins/boards
* can message other users
* can search boards
* the ability to shop on the app through interal or external browser
* ...

### 2. Screen Archetypes

* Login 
   * User is able to log in 
   * User will stay logged in after app is closed and reopen.
* Homepage 
   * users can see other users' "pins/boards"
* Profile
   * users can see their profile with their uploaded pin/board
* camera
    *User will be able to upload a picture with a description as a "pin/board"
### 3. Navigation

**Tab Navigation** (Tab to Screen)

* home
* search
* messages
* profile

**Flow Navigation** (Screen to Screen)

* forced login
   * create account if no login is provided
   * creditials authenicated --> home screen
* home screen --> list of images
* messages --> jumps to chat
* profile --> manages your account

## Wireframes
<img src="https://github.com/CSC-4001-Pinterest/PinterestApp/blob/main/IMG_2878.jpg" width=600>

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 
[This section will be completed in Unit 9]
### Models
Property |	Type | Description
| --- | --- | --- |
objectId |String	|unique id for the user post (default field)
author	| Pointer to User	| image author
image |	File	| image that user posts
caption |	String |	image caption by author
commentsCount |	Number | number of comments that has been posted to an image
likesCount |	Number |	number of likes for the post
createdAt |	DateTime |	date when post is created (default field)
updatedAt	| DateTime	| date when post is last updated (default field)
### Networking
- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]

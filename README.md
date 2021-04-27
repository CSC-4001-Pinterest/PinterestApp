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

- [] User will be able to upload a picture with a description as a "pin/board"
- [x] User is able to log in 
- [] User will stay logged in after app is closed and reopen.
- [] users can see other users' "pins/boards"
- [] users can see their profile with their uploaded pin/board

**Optional Nice-to-have Stories**

* Can save other users' pins/boards
* can message other users
* can search boards


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

### Models
Property |	Type | Description
| --- | --- | --- |
objectId |String	|unique id for the user post (default field)
author	| Pointer to User	| image author
image |	File	| image that user posts
caption |	String |	image caption by author
likesCount |	Number |	number of likes for the post
createdAt |	DateTime |	date when post is created (default field)
updatedAt	| DateTime	| date when post is last updated (default field)
### Networkin
-Home Feed Screen
  
    -ParseQuery<Post> query = ParseQuery.getQuery(className: "Post");
    -query.include("author", equalTo: currentUser);
    -query.addDescendingOrder("createdAt");
    -query.findInBackground(new FindCallback<Post>()
    -//TODO: FindCallback<Post>
    
  - (Create/POST) Create a new like on a post
  - (Delete) Delete existing like
  - (Create/POST) Create a new comment on a post
  - (Delete) Delete existing comment


-Create Post Screen 
  -(Create/POST) Create a new post object
  
      - //TODO - launchCamera()
      - //TODO- getPhotoFileUri
      - //TODO- savePost
        - ParseQuery<Post> query = ParseQuery.getQuery(className: "Post");
            -query.setDescription(description);
            -query.setImage(new ParseFile(photoFile));
            -query.setUser(currentUser);
            -query.saveInBackground


- Profile Screen
  - (Read/GET) Query logged in user object
  - (Read/GET) Query CurrentUser "pins/boards"
    
    
  
            -ParseQuery<Post> query = ParseQuery.getQuery(className: "Post");
            -query.include(Post.KEY_USER);
            -query.whereEqualTo(Post.KEY_USER, ParseUser.getCurrentUser());
            -query.addDescendingOrder(Post.KEY_CREATED_KEY);
            -query.findInBackground(new FindCallback<Post>()
            -//TODO FindCallback<Post>


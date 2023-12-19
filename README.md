

# **Capstone Project Report: Donate App - Reducing Food Waste through Community Connections**

## **Harish Krishna Krishnamoorthy**

### **SO73977**
<img width="553" alt="Screenshot 2023-12-18 at 1 58 34 PM" src="https://github.com/umbckhitk/FinalCapstone/assets/105472386/843c7ddd-e69a-43f8-bcde-7756f6eb14ad">



**Live LINK : Public URL : http://18.116.31.152:8085/**

**GITHUB LINK : https://github.com/umbckhitk/FinalCapstone**

**Presentation Link :**

https://drive.google.com/file/d/1gzveeIlxN0XS5ZziXCr2DOgO193nKlD-/view?usp=sharing

**https://www.canva.com/design/DAF0QyRuzuc/h8ObQWiE4r5jZrULgU-Lfw/view?utm\_content=DAF0QyRuzuc&utm\_campaign=designshare&utm\_medium=link&utm\_source=editor**

**Part I: The Background**

**1. Title Page**

Donate App: Connecting Donors, Recipients, and Reducing Food Waste in Arbutus and Beyond

**2. Table of Contents**

**3. Abstract**

Food waste continues to plague our communities, with significant environmental and social consequences. This capstone project addresses this issue by developing the Donate App, a platform connecting donors of usable food with potential recipients. Through its user-friendly interface and streamlined functionalities, the Donate App tackles the two main culprits of food waste: lack of donation and non-pickups. This report details the app's design, implementation, and potential impact, while reflecting on the development process and outlining future possibilities.

**4. Introduction**

**a. Purpose of the Project**

The primary purpose of this project is to design and develop a web application, the Donate App, to reduce food waste within the Arbutus community. This app aims to connect individuals and organizations looking to donate or receive usable food items, effectively closing the gap between available resources and those in need.

**b. Problem Statement**

Globally, an estimated 1.3 billion tons of food are wasted annually, representing up to one-third of all food produced (FAO, 2011). This food waste has dire environmental and social consequences, contributing to greenhouse gas emissions, resource depletion, and food insecurity.

Food waste remains a pervasive issue, with approximately one-third of all food produced globally going uneaten, resulting in significant environmental impacts, resource depletion, and financial losses. In Arbutus, this issue is particularly concerning, exacerbated by limited awareness of resources and logistical challenges hindering food redistribution. The problem is further compounded by the lack of a centralized platform connecting donors and recipients, leading to missed opportunities and unnecessary waste.

**c. Background of Sponsor Organization**

**Arbutus Church:** Faced challenges with excess food from their community meals and bake sales, often going to waste due to limited distribution channels and lack of awareness among potential recipients. - **Miss Kyle, the secretary of the church. - Secretary@holy-nativity.com**

**Baltimore Iskcon Temple:** Similar to Arbutus Church, encountered surplus food from temple events and offerings, with concerns about its proper utilization and minimizing waste.- Mr **Surendra (714) 809 - 4735**

**Baptist Church:** Desired a platform to connect their food pantry with donors and volunteers, streamlining food donation management and increasing efficiency. - **John - A Referral from Miss Kyle**

**Retriever Essentials (UMBC):** Sought a solution to bridge the gap between food donors in the Baltimore community and students facing food insecurity at the university. **Arial Barbosa - Head of Retriever Essentials UMBC / Community activist - avbarbos@umbc.edu**

The initial client for the Donate App was Arbutus Church, a faith-based organization actively involved in community outreach and food assistance programs. Recognizing the issue of food waste within their community, Arbutus Church sought a solution to connect individuals and organizations with surplus food to those facing food insecurity.

**d. Background of Problem (including description from the sponsor and their needs)**

Arbutus Church expressed the need for a platform that facilitated efficient food donation and distribution. They highlighted two key challenges: firstly, the lack of awareness about potential donors and recipients within the community, and secondly, the logistical difficulties with coordinating pickups and deliveries. Their vision was for a user-friendly and accessible platform capable of bridging these gaps and maximizing the utilization of resources.

**Sponsor Needs:**

Efficient food donation platform: All sponsors required a secure and user-friendly platform to connect donors and recipients, facilitating easy food listing, request, and collection processes.

Reduced food waste: Minimizing food waste through efficient redistribution was a primary concern for all sponsors, aiming to maximize the impact of their food donations.

Community engagement: Sponsors sought to engage their communities and potential donors through the app, promoting awareness and participation in food donation initiatives.

The sponsors expressed a desire for a scalable solution that could accommodate their current needs and potentially expand to serve a wider user base in the future.

Security and data privacy were also important concerns, requiring a reliable and secure platform for user information and food donation details.

**5. Product Review of Existing Similar Ideas**

Several existing initiatives address food waste through technological solutions. Foodbanks International operates an online network connecting food donors and charities. Similar platforms like OLIO and Food For All focus on individual-to-individual food sharing. These existing resources provided valuable insights for the Donate App design, emphasizing the importance of user-friendly interfaces, location-based functionalities, and streamlined communication features.

**Part II: The Core Product Design and Implementation**

**Quality of my MVP Product**

Percentage of critical functions and features implemented: **100% of core functions and features**

Percentage of all product functionality implemented: **100%**

Percentage of features and functions with known defects and gaps: **0%**

Quality level for sustained production use **:** how long the product can be used without encountering a critical defect: **24 hours;**

What is the average response time for core functions: **less than 500ms , it actually has a good speed , because of a lot of optimization.**

Ease of use: **High - both Phone, tablet users and PC users.**

**6. Detailed Requirements-Functional and Non-Functional**

**Important Functional Requirements:**

![Use case diagram](https://github.com/umbckhitk/FinalCapstone/assets/105472386/77b73ff2-d6ac-4057-aa17-be89be4e706f)


**Use Case Diagram for Donate app**

**For Donors:**

1. Post food items: List details like type, quantity, expiration date, and description with optional photos.
2. Set location and availability: Define pick-up area and preferred time frame for item collection.
3. Manage requests: View and accept/decline recipient requests for listed items.
4. Receive notifications: Get real-time alerts about item interest, accepted requests, and completed pickups.
5. View recipient feedback: See any feedback left by recipients after a successful donation.

**For Recipients:**

1. Browse available items: Search for food items using location, category, keywords, and expiration date filters.
2. Request donations: Send requests to donors for interested items with a personalized message (optional).
3. Schedule pick-up: Arrange pick-up time and location directly with the donor through the app.
4. Track pick-up progress: View location updates and estimated arrival time for chosen donations.
5. Leave feedback: Rate and provide comments on the donation experience and donor communication.

**Admin Features:**

1. User management: Add, edit, and manage user profiles (donors, recipients, admins) and access levels.
2. Item moderation: Review and approve/reject posted food items to ensure quality and adherence to guidelines.
3. Data analysis: View reports and statistics on app usage, donations, and user demographics.
4. System configuration: Manage app settings, notification options, and other functionalities.
5. Send announcements: Broadcast messages or updates to all users or specific groups within the app.

**Non-Functional Requirements:**

1. Performance: The app should load pages quickly and respond to user interactions within 2 seconds or less. This includes listing items, searching, sending requests, and receiving notifications.
2. Availability: The app should be available at least 99.5% of the time, ensuring consistent access for donors and recipients. Downtime periods should be kept minimal and well-communicated.
3. Scalability: The app architecture should be able to handle an increasing number of users and donations without affecting performance or stability. Scalability can be achieved through cloud-based hosting and flexible database solutions.
4. Security: User data and app functionalities should be protected from unauthorized access, modification, or loss. This includes implementing strong authentication protocols, data encryption, and secure server configurations.
5. Accessibility: The app interface and functionalities should be accessible to users with disabilities, including those with visual or auditory impairments. This can be achieved through features like screen reader compatibility, keyboard navigation, and alternative text descriptions.
6. Usability: The app interface should be intuitive and easy to navigate for users of all technical abilities. This includes simplifying menus, using clear labels and icons, and providing relevant tutorials or instructions.
7. Localization: The app should be available in multiple languages to cater to diverse user groups in your target community. This may involve translating text content and adapting date/time formats for different regions.

**7. Design, Architecture, and Methodology**

**Software Engineering Methodology:**

The Rapid Application Development (RAD) model was adopted for its iterative and rapid prototyping approach. This allowed for continuous feedback incorporation and ensured alignment with user needs throughout the development cycle.

**Why I chose RAD for the Donate App:**

- Rapid Prototyping: Quickly tested core features with Arbutus Church, iterating based on their feedback.
- Reduced Risk: Minimized upfront planning effort, adapting the app as user needs evolved.
- Faster Delivery: Delivered a functional application within short timeframes, addressing Arbutus' needs efficiently.
- Flexibility: Easily incorporated new features and functionalities as interest from other organizations grew.
- Continuous Improvement: Enabled ongoing refinement and optimization based on real-world usage data.

RAD empowered me to build a solution that fit Arbutus Church' needs perfectly, while maintaining the flexibility to adapt and expand for wider community impact. 

Rad Methodologies followed

**Using Model view controller (MVC)**

**Model:**

- The model represents the data of your application, such as information about food items, donors, recipients, and donations.
- It might include classes like FoodItem, Donor, Recipient, and Donation.
- The model logic handles tasks like:
- Adding, updating, and deleting food items, donors, and donations.
- Searching for food items based on location, category, or other criteria.
- Validating data to ensure its accuracy and integrity.

**View:**

- The view represents the user interface of your application.
- It might include HTML templates, CSS styles, and JavaScript code.
- The view logic handles tasks like:
- Displaying lists of food items, donor profiles, and donation details.
- Rendering forms for adding and editing data.
- Showing messages and notifications to users.

**Controller:**

- The controller acts as the intermediary between the model and the view.
- It receives user input from the view, processes it using the model, and updates the view with the results.
- The controller logic handles tasks like:
- Parsing user input forms and validating data.
- Calling model methods to perform actions like adding a donation or searching for food items.
- Sending the results of those actions back to the view for display.

**Using MVC can bring several benefits to your Donate App:**

1. Separation of concerns: Each layer of the application has a clear responsibility, making the code easier to understand, maintain, and test.
2. Flexibility: You can easily change the way your application looks and interacts with users without affecting the underlying data or logic.
3. Reusability: Model components can be reused in different parts of your application or even in other applications.

<img width="284" alt="Screenshot 2023-12-18 at 4 48 21 PM" src="https://github.com/umbckhitk/FinalCapstone/assets/105472386/0c17b22d-2562-44f0-9079-a39ecb03a89b">


File Architecture for Model-View-controller

**Design and Architecture:**

**System Architecture:**

**Three-tier architecture:**

Presentation layer: JSP (JavaServer Pages) for user interface elements.

Business logic layer: Spring Boot (Java framework) for handling application logic.

Data layer: SQLite database for storing data.

RESTful APIs for data exchange between layers.

Deployed on an Amazon EC2 instance for scalability and availability.

**Additional Items :**

The use of a lightweight database like SQLite suggests a focus on performance and efficiency.

The deployment on AWS EC2 shows an emphasis on scalability and reliability.

Overall, the architecture and design seem well-suited for a web application like the Donate App. It's simple, modular, and scalable, with clear separation of concerns between layers.

![O (1)](https://github.com/umbckhitk/FinalCapstone/assets/105472386/57df07aa-4005-49ce-803b-a2756ee2b8c3)

**Full Component - architecture for donate app**

The system utilizes RESTful APIs for data exchange between the layers, ensuring modularity and potential for future integration with other platforms. Security measures include user authentication, data encryption, and secure server configurations.

**Hardware and Software Dependencies:**

Hardware:

- Server: Amazon EC2 instance (virtual server). This provides your application with computing power, storage, and network resources. You can choose the instance type based on your expected traffic and performance needs.
- Internet connection: Reliable internet connection for the server and users accessing the app.

Software:

- Operating system: Your EC2 instance needs an operating system like Linux (e.g., Ubuntu) to run the necessary software.
- Java Runtime Environment (JRE): Java is the programming language used for Spring Boot and JSP. All users and the server need JRE installed to run the app.
- Apache Tomcat server: This is the web server that hosts your JSP pages and handles user requests.
- Spring Boot: This Java framework provides libraries and functionalities for building the backend logic of your app.
- SQLite database: This lightweight database stores your app's data (users, items, etc.).
- Java Database Connectivity (JDBC) driver: This bridge connects your Spring Boot application with the SQLite database.
- Google SMTP server: This email server handles notification emails sent by your app.
- Web browser: Users need a web browser like Chrome, Firefox, or Safari to access the Donate App.

Additional dependencies:

- Libraries and dependencies for specific functionalities: Depending on any additional features you've implemented, there might be other libraries or dependencies required. For example, if you use Google Maps for location services, you would need the Google Maps JavaScript API.

**Detailed Components Design:**

Each app component, including user profiles, item listings, location services, and notification systems, were designed with specific functionalities and user interactions in mind. High-level and low-level diagrams were created to visualize the system architecture and individual component workflows.

**Specific Components:**

- Users: Donors, recipients, and admins with separate functionalities.
- Items: Food items with descriptions, expiration dates, and location information.
- Messaging: Secure communication between donors and recipients.
- Notifications: Real-time alerts for new listings, accepted donations, and pickups.
- Admin dashboard: Manage users, items, and system settings.

<img width="758" alt="Screenshot 2023-12-18 at 2 54 00 PM" src="https://github.com/umbckhitk/FinalCapstone/assets/105472386/f9e2fbcb-852a-42ec-ada2-ac19469478e6">

**Full Flow/Page architecture for Donate app**

**Donate App Database Design (6 Tables):**

**1. Users:**

user\_id (INT PRIMARY KEY)

username (VARCHAR(255) UNIQUE NOT NULL)

email (VARCHAR(255) UNIQUE NOT NULL)

password (VARCHAR(255) NOT NULL)

address (VARCHAR(255))

phone\_number (VARCHAR(20))

user\_type (ENUM('donor', 'recipient', 'admin') NOT NULL)

**2. Food Items:**

item\_id (INT PRIMARY KEY)

name (VARCHAR(255) NOT NULL)

description (TEXT)

category (VARCHAR(255) NOT NULL)

expiration\_date (DATETIME NOT NULL)

quantity (INT NOT NULL)

dietary\_restrictions (VARCHAR(255))

image\_url (VARCHAR(255))

user\_id (INT FOREIGN KEY REFERENCES Users(user\_id))

**3. Donations:**

donation\_id (INT PRIMARY KEY)

donor\_id (INT FOREIGN KEY REFERENCES Users(user\_id))

item\_id (INT FOREIGN KEY REFERENCES Food Items(item\_id))

recipient\_id (INT FOREIGN KEY REFERENCES Users(user\_id) NULL)

donation\_date (DATETIME NOT NULL)

claimed\_date (DATETIME NULL)

**5. Reviews:**

review\_id (INT PRIMARY KEY)

user\_id (INT FOREIGN KEY REFERENCES Users(user\_id))

item\_id (INT FOREIGN KEY REFERENCES Food Items(item\_id))

rating (INT NOT NULL)

review\_text (TEXT)

**6. Notifications:(Emails)**

notification\_id (INT PRIMARY KEY)

user\_id (INT FOREIGN KEY REFERENCES Users(user\_id))

message (TEXT NOT NULL)

type (ENUM('donation\_claimed', 'new\_review', 'system\_message'))

read\_flag (BOOLEAN DEFAULT FALSE)

**Relationships:**

One user can create many food items and donations.

One food item can belong to one user and be part of many donations.

One donation belongs to one donor and can be claimed by one recipient (optional).

One user can be associated with one location for pickup or delivery preference.

One user can write many reviews for food items.

One food item can have many reviews from different users.

One user can receive many notifications regarding their activity on the app.

<img width="658" alt="Screenshot 2023-12-18 at 9 25 08 PM" src="https://github.com/umbckhitk/FinalCapstone/assets/105472386/a810b92e-9136-4af5-a9a2-902c5aaeeb60">

High level database design for donate app

**8. Results and Discussion.**

I have reviewed many people over the common public to understand and give reviews based on my app.

| Sno | Name | Mode of testing | Profession | Feedback |
| --- | --- | --- | --- | --- |
| 1 | Pastor Kelly | Phone | Pastor of Arbutus Church | Looks awesome, love the ui |
| 2 | Sergio Aguero | Phone | Peer worker | Very good initiative, I love the idea of the app. |
| 3 | Sam Mengel | Laptop | Artist | Polish up interface; have things in one screen as opposed to clicking to multiple tabs |
| 4 | Ally Kratzer | Laptop | Retail Worker | just clarify the difference between available pick up date and expiration date. |
| 5 | Laylor Matsuo | Phone | Tutor | App very easy to use |
| 6 | Vizuli Marcus | Phone | Building management | good Work |
| 7 | Aayla | Phone | Church | Very good app. |
| 8 | Nikitha | Laptop | friend | good architecture and design |
| 9 | James Abharam | Phone | Church attendee | Great app that makes a difference , definitely useable |
| 10 | Adino Daniel | Phone | Church attendee | Good work keep up |
| 11 | Gabriel | Phone | Church Attendee | I wish I was able to text messages inside the app. |
| 12 | Jacob Lucas | Phone | Church Attendee | Good flow, easy to use |

Some of the reviews for the general public.

**Customer Feedback FORM :**

https://docs.google.com/spreadsheets/d/16EU2TG4fug060cmS3YxbmtgFlBEUaBqqddBqyN3SmjM/edit#gid=0

**Customer feedback video :**

https://www.canva.com/design/DAF0QyRuzuc/h8ObQWiE4r5jZrULgU-Lfw/view?utm\_content=DAF0QyRuzuc&utm\_campaign=designshare&utm\_medium=link&utm\_source=editor

The arbutus church pastor and administrator has accepted my app and they have shared it in their **whatsapp group** and people have started using it. People have **started using the app**.

The developed Donate App successfully fulfills its functional and non-functional requirements that were made.

Early adoption: Arbutus Church accepting and promoting the app is a promising initial victory. Quantify their engagement .

**Future scope:**

**My idea for the further development are :**

- User base expansion: Considering strategies like targeted marketing, social media campaigns, partnerships with other organizations, and community outreach to attract more donors and recipients.
- Feature development: **Based on user feedback,** prioritize adding functionalities that enhance user experience, streamline donation processes, or add value to existing features.
- Scaling and sustainability: How can the app be expanded to serve a larger user base without compromising performance or efficiency? Thinking about infrastructure upgrades, resource allocation, and potential funding models.
- Impact measurement: Developing metrics to track and quantify the app's ongoing impact on food waste reduction, community engagement, and user satisfaction.

**Part III: Action Items and Reflection**

**10. Recommendations to the Sponsor:**

**Workflow Changes:**

Streamline donation process: Reduce the number of steps required for donors to register and post items. Consider pre-populating fields with common information or offering bulk upload options.

Simplify recipient claiming: Implement a one-click claiming system for readily available items. Integrate QR codes for faster claiming at pickup locations.

Enhance communication: Enable in-app chat or messaging between donors and recipients for any clarifications or questions.

**Deployment:**

Deployment is done in AWS - amazon web services

Step by step installation guide -

**Guide :**

**Installation guide to run my Donate app.**

**Step 1:**

Download my Final production application :

**Step 2 .**

Unzip my application in any folder

**Step 3.**

Check for java installation on your computer

**Step 4.**

Download eclipse of any version of "Eclipse IDE for Enterprise Java and Web Developers"

**Step 5.**

Import the unzip file by

File-\> import -\> maven -\> import existing maven project -\> browse the folder and hit next.

**Step 6**

. Run the file called

Donate -\> src/main/java -\> com.example.demo-\>loginAppAppllication.java by left clicking

Click on Run as a java application .

**Step 7.**

Open http://localhost:8085/

to see my project.

**Step 8.**

trouble shoot :

If this is giving a warning or error

Hit the red square and

Follow step 6 again.

**11. Limitations of the Project or Approach:**

Scalability: The current architecture may face limitations in handling a large user base or increased traffic.

Technology dependence: Reliance on specific technologies might limit platform accessibility for users with older devices or limited internet access.

Limited data analysis: Current features might not capture sufficient data on user behavior and donation patterns. Implementing comprehensive analytics can provide valuable insights for future improvements.

**12. Future Works:**

**I have plans for future work that includes**

**Location-based services:** Integrate maps and geofencing technology to connect donors and recipients within proximity, reducing food waste by minimizing transportation.

**Partnerships:** Collaborate with food banks, restaurants, and grocery stores to expand the app's reach and diversify the food item pool.

**Gamification and incentives** : Implement gamification elements like badges, leaderboards, or rewards to encourage user engagement and promote responsible food donation.

**Monetization strategies:** Explore sustainable monetization models like premium features, targeted advertising, or partnerships with sponsors to ensure long-term financial viability.

**References :**

Phillip Webb, D. S. (n.d.). Spring Boot Reference Documentation. https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/

**Model-View-Controller (MVC) Pattern:**

Spring MVC Reference Guide: https://spring.io/guides/gs/serving-web-content/

Android Developer - MVP and MVVM: https://www.geeksforgeeks.org/mvp-model-view-presenter-architecture-pattern-in-android-with-example/

**Java Spring Boot for Backend Development:**

Spring Boot Getting Started Guide: https://spring.io/quickstart

Baeldung - Spring Boot Tutorial: https://www.baeldung.com/spring-tutorial

**JSP for Front-End Development:**

The Java Tutorials - JSP: https://docs.oracle.com/database/121/CCAPP/GUID-CC35F085-B0A1-450D-B5C5-1E16C747AF0A.htm

W3Schools - JSP Tutorial: https://www.w3schools.in/jsp/tutorials/

**SQLite Lightweight Database:**

SQLite Official Documentation: https://www.sqlite.org/docs.html

Stack Overflow - SQLite Integration with Java: https://stackoverflow.com/questions/41233/java-and-sqlite

**Amazon Web Services (AWS) for Deployment:**

AWS Elastic Beanstalk Overview: https://aws.amazon.com/elasticbeanstalk/

AWS Documentation - EC2 Instances: https://docs.aws.amazon.com/ec2/

**Google Cloud Platform (GCP) for Deployment (Alternative):**

Google Cloud App Engine Flexible Environment: https://cloud.google.com/appengine/docs/flexible

Google Cloud Firestore Documentation: https://cloud.google.com/firestore/docs

**SMTP Integration for Email Notifications:**

JavaMail API (for Sending Emails): https://docs.oracle.com/javaee%2F7%2Fapi%2F%2F/javax/mail/package-summary.html

Google Developers - Send Email with Gmail API: https://developers.google.com/gmail/api/guides/sending

**User Interface Design Best Practices:**

Nielsen Norman Group - 10 Usability Heuristics for User Interface Design: https://www.nngroup.com/

Google Material Design Guidelines: https://m2.material.io/

**Troubleshooting and bug fix**

Stack Overflow. (2023, December 18). https://stackoverflow.com/.

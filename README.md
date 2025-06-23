# AI-BASED-RECOMMENDATION-SYSTEM-

*COMPANY* : CODETECH IT SOLUTIONS

*NAME* : JARIPITI POOJITHA

*INTERN ID* : CT04DF549

*DURATION* : 4-WEEKS

*MENTOR* : NEELA SANTOSH

*DESCRIPTION* :

The provided Java program implements a basic user-based collaborative filtering recommendation system using Apache Mahout, a popular machine learning library. The main objective of this system is to recommend items to users based on the preferences of other similar users. The approach used here is collaborative filtering, specifically the user-based method, which identifies users with similar preferences and recommends items based on what those similar users liked. The code starts by importing essential classes from the Mahout library, such as DataModel, UserSimilarity, UserNeighborhood, Recommender, and others that are necessary for building and running the recommendation engine.

The execution begins in the main method, where the first step is loading the dataset. The dataset is expected to be in a CSV file named dataset.csv, and it should contain user-item interaction data in the format: userID,itemID,preferenceValue. This file is read using Mahout’s FileDataModel, which constructs a DataModel object to represent the data internally. Once the data is loaded, the program calculates the similarity between users using the Pearson correlation coefficient through the PearsonCorrelationSimilarity class. Pearson correlation is a widely used statistical technique that measures the linear correlation between two variables—in this case, user preferences—making it effective for detecting similarity in user behavior.

After establishing the similarity metric, the program defines the neighborhood of users. It uses NearestNUserNeighborhood to find the two most similar users to the target user. This method selects the top-N users with the highest similarity scores to form the neighborhood. The size of the neighborhood is set to 2 in this case, meaning the recommender will consider only the two closest users when making recommendations. This helps in filtering out noise and focusing only on the most relevant users.

Next, the program creates a user-based recommender instance using GenericUserBasedRecommender, which takes the data model, the defined neighborhood, and the similarity metric as parameters. This recommender engine is now ready to generate personalized suggestions. The recommendation request is made for the user with ID 3, and the system is instructed to return the top 3 recommended items. The result is a list of RecommendedItem objects, each containing an item ID and an associated recommendation score that represents the strength or confidence of the recommendation.

Finally, the program prints the recommended items for user 3, displaying both the item ID and its score. These scores help in understanding how strongly the system believes that the user will like the recommended item. If an exception occurs at any point, it is caught and printed using e.printStackTrace() to help with debugging.

In summary, this Java program provides a clear and practical example of how to build a user-based recommendation system using Apache Mahout. It demonstrates key concepts in recommendation systems such as data modeling, similarity computation, neighborhood formation, and generating personalized suggestions. This type of system is widely used in real-world applications like e-commerce platforms, movie and music streaming services, and social networks to improve user engagement by suggesting relevant content.

*OUTPUT* :

Recommendations for User 5:

Item: 201 | Score: 6.20

Item: 203 | Score: 5.90

Item: 204 | Score: 4.80


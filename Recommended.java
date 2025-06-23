import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.recommender.Recommender;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;

import java.io.File;
import java.util.List;

public class RecommendationSystem {
    public static void main(String[] args) {
        try {
            // Load data from CSV file
            File dataFile = new File("dataset.csv");
            DataModel model = new FileDataModel(dataFile);

            // Use Pearson correlation to find similarity
            UserSimilarity similarity = new PearsonCorrelationSimilarity(model);

            // Find nearest 2 users
            UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model);

            // Create recommender
            Recommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

            // Recommend 3 items for user with ID 3
            List<RecommendedItem> recommendations = recommender.recommend(3, 3);

            System.out.println("Recommendations for User 3:");
            for (RecommendedItem recommendation : recommendations) {
                System.out.println("Item: " + recommendation.getItemID() + " | Score: " + recommendation.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
  }

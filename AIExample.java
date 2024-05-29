import weka.classifiers.functions.LinearRegression;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ArffLoader;
import weka.filters.unsupervised.attribute.Normalize;

public class AIExample {

    public static void main(String[] args) throws Exception {
        // Load the ARFF (Attribute-Relation File Format) data file
        ArffLoader loader = new ArffLoader();
        loader.setFile(new java.io.File("data.arff")); // Replace with your data file path
        Instances data = loader.getDataSet();

        // Normalize the data for better model performance
        Normalize filter = new Normalize();
        filter.setInputFormat(data);
        data = filter.process(data);

        // Define the class attribute (target variable)
        int classIndex = data.numAttributes() - 1;
        data.setClassIndex(classIndex);

        // Create a linear regression model
        LinearRegression model = new LinearRegression();
        model.buildClassifier(data);

        // Make a prediction for a new data point
        double[] newValues = new double[data.numAttributes()];
        // Set values for the new data point (replace with your desired values)
        newValues[0] = 5; // Replace with first attribute value
        newValues[1] = 10; // Replace with second attribute value
        // ... (add values for all attributes)

        Instance newData = new Instance(1.0, newValues);
        newData.setDataset(data);

        double prediction = model.classifyInstance(newData);
        System.out.println("Predicted value: " + prediction);
    }
}
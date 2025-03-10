package br.com.douglas444.echo;

import br.com.douglas444.streams.processor.StreamsProcessorBuilder;
import br.ufu.facom.pcf.core.Interceptor;

public class ECHOBuilder implements StreamsProcessorBuilder {

    private final ECHO echo;

    public ECHOBuilder(int q,
                       int k,
                       double centroidsPercentage,
                       int mciKMeansMaxIterations,
                       int conditionalModeMaxIterations,
                       double gamma,
                       double sensitivity,
                       double confidenceThreshold,
                       double activeLearningThreshold,
                       int filteredOutlierBufferMaxSize,
                       int confidenceWindowMaxSize,
                       int ensembleSize,
                       int randomGeneratorSeed,
                       int chunkSize,
                       boolean keepNoveltyDecisionModel,
                       boolean multiClassNoveltyDetection) {

        echo = new ECHO(
                q,
                k,
                centroidsPercentage,
                mciKMeansMaxIterations,
                conditionalModeMaxIterations,
                gamma,
                sensitivity,
                confidenceThreshold,
                activeLearningThreshold,
                filteredOutlierBufferMaxSize,
                confidenceWindowMaxSize,
                ensembleSize,
                randomGeneratorSeed,
                chunkSize,
                keepNoveltyDecisionModel,
                multiClassNoveltyDetection,
                null);

    }

    public ECHOBuilder(int q,
                       int k,
                       double centroidPercentage,
                       int mciKMeansMaxIterations,
                       int conditionalModeMaxIterations,
                       double gamma,
                       double sensitivity,
                       double confidenceThreshold,
                       double activeLearningThreshold,
                       int filteredOutlierBufferMaxSize,
                       int confidenceWindowMaxSize,
                       int ensembleSize,
                       int randomGeneratorSeed,
                       int chunkSize,
                       boolean keepNoveltyDecisionModel,
                       boolean multiClassNoveltyDetection,
                       Interceptor interceptor) {

        echo = new ECHO(
                q,
                k,
                centroidPercentage,
                mciKMeansMaxIterations,
                conditionalModeMaxIterations,
                gamma,
                sensitivity,
                confidenceThreshold,
                activeLearningThreshold,
                filteredOutlierBufferMaxSize,
                confidenceWindowMaxSize,
                ensembleSize,
                randomGeneratorSeed,
                chunkSize,
                keepNoveltyDecisionModel,
                multiClassNoveltyDetection,
                interceptor);

    }

    @Override
    public ECHOController build() {
        return new ECHOController(echo);
    }

}

file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-End/scala/scala-bloging/scala-bloging/src/main/scala/3.Function-P/Higher-order-Functions.scala
### java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 2.13.12
Classpath:
<WORKSPACE>\.bloop\scala-bloging\bloop-bsp-clients-classes\classes-Metals-hhB1O0saS66HfBAF42tdqw== [exists ], <HOME>\AppData\Local\bloop\cache\semanticdb\com.sourcegraph.semanticdb-javac.0.11.0\semanticdb-javac-0.11.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.12\scala-library-2.13.12.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\modules\scala-parser-combinators_2.13\2.3.0\scala-parser-combinators_2.13-2.3.0.jar [exists ]
Options:
-Yrangepos -Xplugin-require:semanticdb


action parameters:
uri: file:///C:/Users/wjdgh/Desktop/bloging-tistory/back-End/scala/scala-bloging/scala-bloging/src/main/scala/3.Function-P/Higher-order-Functions.scala
text:
```scala
package `3.Func
```



#### Error stacktrace:

```
scala.meta.internal.mtags.MtagsEnrichments$XtensionPositionMtags.adjust(MtagsEnrichments.scala:254)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.collect(PcSemanticTokensProvider.scala:64)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.collect(PcSemanticTokensProvider.scala:19)
	scala.meta.internal.pc.PcCollector.scala$meta$internal$pc$PcCollector$$collect$1(PcCollector.scala:108)
	scala.meta.internal.pc.PcCollector.traverseWithParent$1(PcCollector.scala:177)
	scala.meta.internal.pc.PcCollector.traverseSought(PcCollector.scala:314)
	scala.meta.internal.pc.PcCollector.traverseSought$(PcCollector.scala:95)
	scala.meta.internal.pc.SimpleCollector.traverseSought(PcCollector.scala:337)
	scala.meta.internal.pc.PcCollector.resultAllOccurences(PcCollector.scala:89)
	scala.meta.internal.pc.PcCollector.resultAllOccurences$(PcCollector.scala:85)
	scala.meta.internal.pc.SimpleCollector.resultAllOccurences(PcCollector.scala:337)
	scala.meta.internal.pc.SimpleCollector.result(PcCollector.scala:342)
	scala.meta.internal.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:73)
	scala.meta.internal.pc.ScalaPresentationCompiler.$anonfun$semanticTokens$1(ScalaPresentationCompiler.scala:196)
```
#### Short summary: 

java.lang.ArrayIndexOutOfBoundsException: Index 16 out of bounds for length 16
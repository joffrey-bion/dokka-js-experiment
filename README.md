In order to reproduce the problem, clone this repository and run:

```
$ ./gradlew dokka
```

You should get the following stacktrace:

```
> Task :dokka
WARN: zip END header not found: /Users/<user>/projects/dokka-js-experiment/build/js/node_modules/sockjs-client/lib
/entry.js
java.util.zip.ZipException: zip END header not found
        at java.base/java.util.zip.ZipFile$Source.zerror(ZipFile.java:1535)
        at java.base/java.util.zip.ZipFile$Source.findEND(ZipFile.java:1436)
        at java.base/java.util.zip.ZipFile$Source.initCEN(ZipFile.java:1443)
        at java.base/java.util.zip.ZipFile$Source.<init>(ZipFile.java:1274)
        at java.base/java.util.zip.ZipFile$Source.get(ZipFile.java:1237)
        at java.base/java.util.zip.ZipFile$CleanableResource.<init>(ZipFile.java:727)
        at java.base/java.util.zip.ZipFile$CleanableResource.get(ZipFile.java:844)
        at java.base/java.util.zip.ZipFile.<init>(ZipFile.java:247)
        at java.base/java.util.zip.ZipFile.<init>(ZipFile.java:177)
        at java.base/java.util.zip.ZipFile.<init>(ZipFile.java:148)
        at com.intellij.openapi.vfs.impl.ZipHandler$1.createAccessor(ZipHandler.java:45)
        at com.intellij.openapi.vfs.impl.ZipHandler$1.createAccessor(ZipHandler.java:39)
        at com.intellij.util.io.FileAccessorCache.createHandle(FileAccessorCache.java:60)
        at com.intellij.util.io.FileAccessorCache.get(FileAccessorCache.java:52)
        at com.intellij.openapi.vfs.impl.ZipHandler.getCachedZipFileHandle(ZipHandler.java:83)
        at com.intellij.openapi.vfs.impl.ZipHandler.acquireZipHandle(ZipHandler.java:129)
        at com.intellij.openapi.vfs.impl.ZipHandlerBase.createEntriesMap(ZipHandlerBase.java:44)
        at com.intellij.openapi.vfs.impl.ArchiveHandler.getEntriesMap(ArchiveHandler.java:197)
        at com.intellij.openapi.vfs.impl.jar.CoreJarHandler.<init>(CoreJarHandler.java:42)
        at com.intellij.openapi.vfs.impl.jar.CoreJarFileSystem.lambda$new$0(CoreJarFileSystem.java:33)
        at com.intellij.util.containers.ConcurrentFactoryMap$3.create(ConcurrentFactoryMap.java:212)
        at com.intellij.util.containers.ConcurrentFactoryMap.get(ConcurrentFactoryMap.java:59)
        at com.intellij.openapi.vfs.impl.jar.CoreJarFileSystem.findFileByPath(CoreJarFileSystem.java:44)
        at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.findJarRoot(KotlinCoreEnvironment.kt:412)
        at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.contentRootToVirtualFile(KotlinCoreEnvironment.kt:391)
        at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.access$contentRootToVirtualFile(KotlinCoreEnvironment.kt:121)
        at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment$6.invoke(KotlinCoreEnvironment.kt:269)
        at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment$6.invoke(KotlinCoreEnvironment.kt:121)
        at org.jetbrains.kotlin.cli.jvm.compiler.ClasspathRootsResolver.convertClasspathRoots(ClasspathRootsResolver.kt:70)
        at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>(KotlinCoreEnvironment.kt:276)
        at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.<init>(KotlinCoreEnvironment.kt:121)
        at org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment$Companion.createForProduction(KotlinCoreEnvironment.kt:513)
        at org.jetbrains.dokka.AnalysisEnvironment.createCoreEnvironment(AnalysisEnvironment.kt:89)
        at org.jetbrains.dokka.Utilities.DokkaAnalysisModule.configure(DokkaModules.kt:35)
        at com.google.inject.spi.Elements$RecordingBinder.install(Elements.java:223)
        at com.google.inject.spi.Elements.getElements(Elements.java:101)
        at com.google.inject.internal.InjectorShell$Builder.build(InjectorShell.java:133)
        at com.google.inject.internal.InternalInjectorCreator.build(InternalInjectorCreator.java:103)
        at com.google.inject.internal.InjectorImpl.createChildInjector(InjectorImpl.java:217)
        at com.google.inject.internal.InjectorImpl.createChildInjector(InjectorImpl.java:224)
        at org.jetbrains.dokka.DokkaGenerator.appendSourceModule(DokkaGenerator.kt:86)
        at org.jetbrains.dokka.DokkaGenerator.generate(DokkaGenerator.kt:41)
        at org.jetbrains.dokka.DokkaBootstrapImpl.generate(DokkaBootstrapImpl.kt:75)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:566)
        at org.jetbrains.dokka.gradle.DelegatedInvocationHandler.invoke(ProxyUtils.kt:41)
        at com.sun.proxy.$Proxy79.generate(Unknown Source)
        at org.jetbrains.dokka.gradle.DokkaTask.generate(DokkaTask.kt:177)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:566)
        at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:104)
        at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:49)
        at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:42)
        at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:28)
        at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:721)
        at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:688)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$3.run(ExecuteActionsTaskExecuter.java:539)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:402)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:394)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$1.execute(DefaultBuildOperationExecutor.java:165)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:250)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:158)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:92)
        at org.gradle.internal.operations.DelegatingBuildOperationExecutor.run(DelegatingBuildOperationExecutor.java:31)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeAction(ExecuteActionsTaskExecuter.java:524)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:507)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.access$300(ExecuteActionsTaskExecuter.java:109)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$TaskExecution.executeWithPreviousOutputFiles(ExecuteActionsTaskExecuter.java:258)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$TaskExecution.execute(ExecuteActionsTaskExecuter.java:247)
        at org.gradle.internal.execution.steps.ExecuteStep.lambda$execute$1(ExecuteStep.java:33)
        at java.base/java.util.Optional.orElseGet(Optional.java:369)
        at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:33)
        at org.gradle.internal.execution.steps.ExecuteStep.execute(ExecuteStep.java:26)
        at org.gradle.internal.execution.steps.CleanupOutputsStep.execute(CleanupOutputsStep.java:63)
        at org.gradle.internal.execution.steps.CleanupOutputsStep.execute(CleanupOutputsStep.java:35)
        at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:49)
        at org.gradle.internal.execution.steps.ResolveInputChangesStep.execute(ResolveInputChangesStep.java:34)
        at org.gradle.internal.execution.steps.CancelExecutionStep.execute(CancelExecutionStep.java:43)
        at org.gradle.internal.execution.steps.TimeoutStep.executeWithoutTimeout(TimeoutStep.java:73)
        at org.gradle.internal.execution.steps.TimeoutStep.execute(TimeoutStep.java:54)
        at org.gradle.internal.execution.steps.CatchExceptionStep.execute(CatchExceptionStep.java:34)
        at org.gradle.internal.execution.steps.CreateOutputsStep.execute(CreateOutputsStep.java:44)
        at org.gradle.internal.execution.steps.SnapshotOutputsStep.execute(SnapshotOutputsStep.java:54)
        at org.gradle.internal.execution.steps.SnapshotOutputsStep.execute(SnapshotOutputsStep.java:38)
        at org.gradle.internal.execution.steps.CacheStep.executeWithoutCache(CacheStep.java:153)
        at org.gradle.internal.execution.steps.CacheStep.execute(CacheStep.java:67)
        at org.gradle.internal.execution.steps.CacheStep.execute(CacheStep.java:41)
        at org.gradle.internal.execution.steps.BroadcastChangingOutputsStep.execute(BroadcastChangingOutputsStep.java:49)
        at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:44)
        at org.gradle.internal.execution.steps.StoreExecutionStateStep.execute(StoreExecutionStateStep.java:33)
        at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:38)
        at org.gradle.internal.execution.steps.RecordOutputsStep.execute(RecordOutputsStep.java:24)
        at org.gradle.internal.execution.steps.SkipUpToDateStep.executeBecause(SkipUpToDateStep.java:92)
        at org.gradle.internal.execution.steps.SkipUpToDateStep.lambda$execute$0(SkipUpToDateStep.java:85)
        at java.base/java.util.Optional.map(Optional.java:265)
        at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:55)
        at org.gradle.internal.execution.steps.SkipUpToDateStep.execute(SkipUpToDateStep.java:39)
        at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:76)
        at org.gradle.internal.execution.steps.ResolveChangesStep.execute(ResolveChangesStep.java:37)
        at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:36)
        at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsFinishedStep.execute(MarkSnapshottingInputsFinishedStep.java:26)
        at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:94)
        at org.gradle.internal.execution.steps.ResolveCachingStateStep.execute(ResolveCachingStateStep.java:49)
        at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:79)
        at org.gradle.internal.execution.steps.CaptureStateBeforeExecutionStep.execute(CaptureStateBeforeExecutionStep.java:53)
        at org.gradle.internal.execution.steps.ValidateStep.execute(ValidateStep.java:74)
        at org.gradle.internal.execution.steps.SkipEmptyWorkStep.lambda$execute$2(SkipEmptyWorkStep.java:78)
        at java.base/java.util.Optional.orElseGet(Optional.java:369)
        at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:78)
        at org.gradle.internal.execution.steps.SkipEmptyWorkStep.execute(SkipEmptyWorkStep.java:34)
        at org.gradle.internal.execution.steps.legacy.MarkSnapshottingInputsStartedStep.execute(MarkSnapshottingInputsStartedStep.java:39)
        at org.gradle.internal.execution.steps.LoadExecutionStateStep.execute(LoadExecutionStateStep.java:40)
        at org.gradle.internal.execution.steps.LoadExecutionStateStep.execute(LoadExecutionStateStep.java:28)
        at org.gradle.internal.execution.impl.DefaultWorkExecutor.execute(DefaultWorkExecutor.java:33)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeIfValid(ExecuteActionsTaskExecuter.java:174)
        at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:166)
        at org.gradle.api.internal.tasks.execution.CleanupStaleOutputsExecuter.execute(CleanupStaleOutputsExecuter.java:109)
        at org.gradle.api.internal.tasks.execution.FinalizePropertiesTaskExecuter.execute(FinalizePropertiesTaskExecuter.java:46)
        at org.gradle.api.internal.tasks.execution.ResolveTaskExecutionModeExecuter.execute(ResolveTaskExecutionModeExecuter.java:62)
        at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:57)
        at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:56)
        at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:36)
        at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.executeTask(EventFiringTaskExecuter.java:77)
        at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:55)
        at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter$1.call(EventFiringTaskExecuter.java:52)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$CallableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:416)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$CallableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:406)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$1.execute(DefaultBuildOperationExecutor.java:165)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:250)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:158)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:102)
        at org.gradle.internal.operations.DelegatingBuildOperationExecutor.call(DelegatingBuildOperationExecutor.java:36)
        at org.gradle.api.internal.tasks.execution.EventFiringTaskExecuter.execute(EventFiringTaskExecuter.java:52)
        at org.gradle.execution.plan.LocalTaskNodeExecutor.execute(LocalTaskNodeExecutor.java:41)
        at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:374)
        at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$InvokeNodeExecutorsAction.execute(DefaultTaskExecutionGraph.java:361)
        at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:354)
        at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph$BuildOperationAwareExecutionAction.execute(DefaultTaskExecutionGraph.java:340)
        at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.lambda$run$0(DefaultPlanExecutor.java:127)
        at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.execute(DefaultPlanExecutor.java:191)
        at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.executeNextNode(DefaultPlanExecutor.java:182)
        at org.gradle.execution.plan.DefaultPlanExecutor$ExecutorWorker.run(DefaultPlanExecutor.java:124)
        at org.gradle.execution.plan.DefaultPlanExecutor.process(DefaultPlanExecutor.java:72)
        at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph.executeWithServices(DefaultTaskExecutionGraph.java:191)
        at org.gradle.execution.taskgraph.DefaultTaskExecutionGraph.execute(DefaultTaskExecutionGraph.java:168)
        at org.gradle.execution.SelectedTaskExecutionAction.execute(SelectedTaskExecutionAction.java:41)
        at org.gradle.execution.DefaultBuildWorkExecutor.execute(DefaultBuildWorkExecutor.java:40)
        at org.gradle.execution.DefaultBuildWorkExecutor.access$000(DefaultBuildWorkExecutor.java:24)
        at org.gradle.execution.DefaultBuildWorkExecutor$1.proceed(DefaultBuildWorkExecutor.java:48)
        at org.gradle.execution.DryRunBuildExecutionAction.execute(DryRunBuildExecutionAction.java:49)
        at org.gradle.execution.DefaultBuildWorkExecutor.execute(DefaultBuildWorkExecutor.java:40)
        at org.gradle.execution.DefaultBuildWorkExecutor.execute(DefaultBuildWorkExecutor.java:33)
        at org.gradle.execution.IncludedBuildLifecycleBuildWorkExecutor.execute(IncludedBuildLifecycleBuildWorkExecutor.java:36)
        at org.gradle.execution.DeprecateUndefinedBuildWorkExecutor.execute(DeprecateUndefinedBuildWorkExecutor.java:39)
        at org.gradle.execution.BuildOperationFiringBuildWorkerExecutor$ExecuteTasks.run(BuildOperationFiringBuildWorkerExecutor.java:56)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:402)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:394)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$1.execute(DefaultBuildOperationExecutor.java:165)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:250)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:158)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:92)
        at org.gradle.internal.operations.DelegatingBuildOperationExecutor.run(DelegatingBuildOperationExecutor.java:31)
        at org.gradle.execution.BuildOperationFiringBuildWorkerExecutor.execute(BuildOperationFiringBuildWorkerExecutor.java:41)
        at org.gradle.initialization.DefaultGradleLauncher.runWork(DefaultGradleLauncher.java:241)
        at org.gradle.initialization.DefaultGradleLauncher.doClassicBuildStages(DefaultGradleLauncher.java:151)
        at org.gradle.initialization.DefaultGradleLauncher.doBuildStages(DefaultGradleLauncher.java:130)
        at org.gradle.initialization.DefaultGradleLauncher.executeTasks(DefaultGradleLauncher.java:110)
        at org.gradle.internal.invocation.GradleBuildController$1.execute(GradleBuildController.java:60)
        at org.gradle.internal.invocation.GradleBuildController$1.execute(GradleBuildController.java:57)
        at org.gradle.internal.invocation.GradleBuildController$3.create(GradleBuildController.java:85)
        at org.gradle.internal.invocation.GradleBuildController$3.create(GradleBuildController.java:78)
        at org.gradle.internal.work.DefaultWorkerLeaseService.withLocks(DefaultWorkerLeaseService.java:189)
        at org.gradle.internal.work.StopShieldingWorkerLeaseService.withLocks(StopShieldingWorkerLeaseService.java:40)
        at org.gradle.internal.invocation.GradleBuildController.doBuild(GradleBuildController.java:78)
        at org.gradle.internal.invocation.GradleBuildController.run(GradleBuildController.java:57)
        at org.gradle.tooling.internal.provider.ExecuteBuildActionRunner.run(ExecuteBuildActionRunner.java:31)
        at org.gradle.launcher.exec.ChainingBuildActionRunner.run(ChainingBuildActionRunner.java:35)
        at org.gradle.launcher.exec.BuildOutcomeReportingBuildActionRunner.run(BuildOutcomeReportingBuildActionRunner.java:63)
        at org.gradle.tooling.internal.provider.ValidatingBuildActionRunner.run(ValidatingBuildActionRunner.java:32)
        at org.gradle.launcher.exec.BuildCompletionNotifyingBuildActionRunner.run(BuildCompletionNotifyingBuildActionRunner.java:39)
        at org.gradle.launcher.exec.RunAsBuildOperationBuildActionRunner$3.call(RunAsBuildOperationBuildActionRunner.java:51)
        at org.gradle.launcher.exec.RunAsBuildOperationBuildActionRunner$3.call(RunAsBuildOperationBuildActionRunner.java:45)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$CallableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:416)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$CallableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:406)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor$1.execute(DefaultBuildOperationExecutor.java:165)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:250)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:158)
        at org.gradle.internal.operations.DefaultBuildOperationExecutor.call(DefaultBuildOperationExecutor.java:102)
        at org.gradle.internal.operations.DelegatingBuildOperationExecutor.call(DelegatingBuildOperationExecutor.java:36)
        at org.gradle.launcher.exec.RunAsBuildOperationBuildActionRunner.run(RunAsBuildOperationBuildActionRunner.java:45)
        at org.gradle.launcher.exec.InProcessBuildActionExecuter$1.transform(InProcessBuildActionExecuter.java:50)
        at org.gradle.launcher.exec.InProcessBuildActionExecuter$1.transform(InProcessBuildActionExecuter.java:47)
        at org.gradle.composite.internal.DefaultRootBuildState.run(DefaultRootBuildState.java:78)
        at org.gradle.launcher.exec.InProcessBuildActionExecuter.execute(InProcessBuildActionExecuter.java:47)
        at org.gradle.launcher.exec.InProcessBuildActionExecuter.execute(InProcessBuildActionExecuter.java:31)
        at org.gradle.launcher.exec.BuildTreeScopeBuildActionExecuter.execute(BuildTreeScopeBuildActionExecuter.java:42)
        at org.gradle.launcher.exec.BuildTreeScopeBuildActionExecuter.execute(BuildTreeScopeBuildActionExecuter.java:28)
        at org.gradle.tooling.internal.provider.ContinuousBuildActionExecuter.execute(ContinuousBuildActionExecuter.java:78)
        at org.gradle.tooling.internal.provider.ContinuousBuildActionExecuter.execute(ContinuousBuildActionExecuter.java:52)
        at org.gradle.tooling.internal.provider.SubscribableBuildActionExecuter.execute(SubscribableBuildActionExecuter.java:59)
        at org.gradle.tooling.internal.provider.SubscribableBuildActionExecuter.execute(SubscribableBuildActionExecuter.java:36)
        at org.gradle.tooling.internal.provider.SessionScopeBuildActionExecuter.execute(SessionScopeBuildActionExecuter.java:68)
        at org.gradle.tooling.internal.provider.SessionScopeBuildActionExecuter.execute(SessionScopeBuildActionExecuter.java:38)
        at org.gradle.tooling.internal.provider.GradleThreadBuildActionExecuter.execute(GradleThreadBuildActionExecuter.java:37)
        at org.gradle.tooling.internal.provider.GradleThreadBuildActionExecuter.execute(GradleThreadBuildActionExecuter.java:26)
        at org.gradle.tooling.internal.provider.ParallelismConfigurationBuildActionExecuter.execute(ParallelismConfigurationBuildActionExecuter.java:43)
        at org.gradle.tooling.internal.provider.ParallelismConfigurationBuildActionExecuter.execute(ParallelismConfigurationBuildActionExecuter.java:29)
        at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:60)
        at org.gradle.tooling.internal.provider.StartParamsValidatingActionExecuter.execute(StartParamsValidatingActionExecuter.java:32)
        at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:55)
        at org.gradle.tooling.internal.provider.SessionFailureReportingActionExecuter.execute(SessionFailureReportingActionExecuter.java:41)
        at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:48)
        at org.gradle.tooling.internal.provider.SetupLoggingActionExecuter.execute(SetupLoggingActionExecuter.java:32)
        at org.gradle.launcher.daemon.server.exec.ExecuteBuild.doBuild(ExecuteBuild.java:68)
        at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
        at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
        at org.gradle.launcher.daemon.server.exec.WatchForDisconnection.execute(WatchForDisconnection.java:39)
        at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
        at org.gradle.launcher.daemon.server.exec.ResetDeprecationLogger.execute(ResetDeprecationLogger.java:27)
        at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
        at org.gradle.launcher.daemon.server.exec.RequestStopIfSingleUsedDaemon.execute(RequestStopIfSingleUsedDaemon.java:35)
        at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
        at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:78)
        at org.gradle.launcher.daemon.server.exec.ForwardClientInput$2.create(ForwardClientInput.java:75)
        at org.gradle.util.Swapper.swap(Swapper.java:38)
        at org.gradle.launcher.daemon.server.exec.ForwardClientInput.execute(ForwardClientInput.java:75)
        at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
        at org.gradle.launcher.daemon.server.exec.LogAndCheckHealth.execute(LogAndCheckHealth.java:55)
        at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
        at org.gradle.launcher.daemon.server.exec.LogToClient.doBuild(LogToClient.java:63)
        at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
        at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
        at org.gradle.launcher.daemon.server.exec.EstablishBuildEnvironment.doBuild(EstablishBuildEnvironment.java:82)
        at org.gradle.launcher.daemon.server.exec.BuildCommandOnly.execute(BuildCommandOnly.java:37)
        at org.gradle.launcher.daemon.server.api.DaemonCommandExecution.proceed(DaemonCommandExecution.java:104)
        at org.gradle.launcher.daemon.server.exec.StartBuildOrRespondWithBusy$1.run(StartBuildOrRespondWithBusy.java:52)
        at org.gradle.launcher.daemon.server.DaemonStateCoordinator$1.run(DaemonStateCoordinator.java:297)
        at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:64)
        at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:48)
        at java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1128)
        at java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:628)
        at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:56)
        at java.base/java.lang.Thread.run(Thread.java:834)
```

Some notes:

- Gradle cache sometimes prevents from reproducing (remove `.gradle/` directory)

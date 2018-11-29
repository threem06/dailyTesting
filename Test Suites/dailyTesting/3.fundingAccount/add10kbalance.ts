<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>add10kbalance</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <lastRun>2018-11-22T13:26:33</lastRun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>30</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>b1ccadde-9dc4-46bc-af60-bb746f67119a</testSuiteGuid>
   <testCaseLink>
      <guid>453cd51a-8163-4e64-a254-3067afcdad17</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/dailyTesting/Frontend/Login/openBrowserFrontend</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>312acd2d-4dda-4426-8d5b-f7d446eb489a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/dailyTesting/Frontend/Login/frontendLogin</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>cb404867-0a39-448f-ae67-a093ab90edda</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/dailyTesting/accountCreation/oneAccount</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>cb404867-0a39-448f-ae67-a093ab90edda</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>username</value>
         <variableId>09aeae3a-73ad-40b1-bf21-c8e4af76ee07</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>cb404867-0a39-448f-ae67-a093ab90edda</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>4dfbef26-28b0-4b74-ba23-20b1d1b8897f</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>2fe5fb49-a8b1-47ff-964c-41641eeda401</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/dailyTesting/Frontend/TransferBalance/transferBalance</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>35669878-abf3-42f6-b11c-acc5738eb8ee</id>
         <iterationEntity>
            <iterationType>ALL</iterationType>
            <value></value>
         </iterationEntity>
         <testDataId>Data Files/dailyTesting/accountCreation/oneAccount</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>35669878-abf3-42f6-b11c-acc5738eb8ee</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>transferBalance</value>
         <variableId>5c1657dc-6905-4736-afb1-2b9091458c1a</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>

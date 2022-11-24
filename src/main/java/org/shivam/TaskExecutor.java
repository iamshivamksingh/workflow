package org.shivam;

public class TaskExecutor {


    public static void main(String[] args) {
        // LCSBuilder
        final Request r = new Request("General Motors", "Electric");
        // SalesDetails
        final Collector c = new Collector();
        final OemTask oemTask = new OemTask();
        final ProgramTask programTask = new ProgramTask();
        TaskManager<Request, Collector> taskManager = new TaskManager<>();
        taskManager.register(oemTask::process);
        taskManager.register(programTask::process);

        taskManager.execute(r, c);

        System.out.println(c);
    }

    /**
     * Pricing workflow:
     * {
     *   "pivot": "GM_EV_CONFIGURATOR_PRICING",
     *   "oem": "GM",
     *   "program": "EV",
     *   "vertical": "CONFIGURATOR",
     *   "component": "PRICING",
     *   "workflow": "CASH",
     *   "levels": [
     *     {
     *       "level": 1,
     *       "async": false,
     *       "tasks": [
     *         "CONFIGURATOR",
     *         "ESTIMATED_PAYMENTS"
     *       ]
     *     }
     *   ]
     * }
     *
     * LCS / OMS workflow:
     * {
     *   "pivot": "GM_EV_BOLT_OMS",
     *   "oem": "GM",
     *   "program": "EV",
     *   "vertical": "BOLT",
     *   "component": "OMS",
     *   "workflow": "FAN_OUT",
     *   "levels": [
     *     {
     *       "level": 1,
     *       "async": true,
     *       "tasks": [
     *         "VEHICLE_INFO",
     *         "FNI",
     *         "ACCESSORIES",
     *         "ONSTAR",
     *         "DISCOVERY"
     *       ]
     *     },
     *     {
     *       "level": 2,
     *       "async": false,
     *       "tasks": [
     *         "PRICING"
     *       ]
     *     }
     *   ]
     * }
     *
     * Ingestion Workflow:
     *{
     *   "pivot": "GM_EV_BOLT_INGESTION",
     *   "oem": "GM",
     *   "program": "EV",
     *   "vertical": "BOLT",
     *   "component": "INGESTION",
     *   "workflow": "INGESTION",
     *   "levels": [
     *     {
     *       "level": 1,
     *       "async": false,
     *       "tasks": [
     *         "VALIDATION"
     *       ]
     *     },
     *     {
     *       "level": 2,
     *       "async": false,
     *       "tasks": [
     *         "TRANSFORMATION"
     *       ]
     *     },
     *     {
     *       "level": 3,
     *       "async": false,
     *       "tasks": [
     *         "ES_SAVE"
     *       ]
     *     },
     *     {
     *       "level": 4,
     *       "async": false,
     *       "tasks": [
     *         "AUDITING"
     *       ]
     *     }
     *   ]
     * }
     *
     *
     * Workflow
     * TaskFactory
     */

}

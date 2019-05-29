package com.example.mclement.applijeubiblio;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;
import android.database.Cursor;
import android.provider.BaseColumns;

import java.util.ArrayList;

/*public class QuizzDb extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "MaBdQuizz.db";
    private static final int DATABASE_VERSION = 1;
    private SQLiteDatabase db;

    public QuizzDb (Context context) {super(context, DATABASE_NAME, null, DATABASE_VERSION);}

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;
        //création de la table avec une requete SQL
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuestionsTable.TABLE_NAME + " ( " +
                QuestionsTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuestionsTable.COLUMN_QUESTION + " TEXT, " +
                QuestionsTable.COLUMN_OPTION1 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION2 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION3 + " TEXT, " +
                QuestionsTable.COLUMN_OPTION4 + " TEXT, " +
                QuestionsTable.COLUMN_REPONSE + " TEXT, " +
                ")";
        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
        lesQuestions();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + QuestionsTable.TABLE_NAME);
        onCreate(db);
    }

    @Override
    public void onConfigure(SQLiteDatabase db) {
        super.onConfigure(db);
        db.setForeignKeyConstraintsEnabled(true);
    }

    private void lesQuestions() {
        //Question bd
        Question q1 = new Question("question bd 1", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q1);
        Question q2 = new Question("question bd 2", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q2);
        Question q3 = new Question("question bd 3", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q3);
        Question q4 = new Question("question bd 4", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q4);
        Question q5 = new Question("question bd 5", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q5);
        //question manga
        Question q6 = new Question("question manga 1", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q6);
        Question q7 = new Question("question manga 2", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q7);
        Question q8 = new Question("question manga 3", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q8);
        Question q9 = new Question("question manga 4", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q9);
        Question q10 = new Question("question manga 5", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q10);
        //question comic
        Question q11 = new Question("question comics 1", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q11);
        Question q12 = new Question("question comics 2", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q12);
        Question q13 = new Question("question comics 3", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q13);
        Question q14 = new Question("question comics 4", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q14);
        Question q15 = new Question("question comics 5", "rep1" ,"rep2","rep3", "rep4",4);
        addQuestion(q15);
    }




    // Méthode servant à ajouter une question
    private void addQuestion(Question question) {
        ContentValues cv = new ContentValues();
        cv.put(QuestionsTable.COLUMN_QUESTION, question.getQuestion());
        cv.put(QuestionsTable.COLUMN_OPTION1, question.getOption1());
        cv.put(QuestionsTable.COLUMN_OPTION2, question.getOption2());
        cv.put(QuestionsTable.COLUMN_OPTION3, question.getOption3());
        cv.put(QuestionsTable.COLUMN_OPTION4, question.getOption3());
        cv.put(QuestionsTable.COLUMN_ANSWER_NR, question.getAnswerNr());
        db.insert(QuestionsTable.TABLE_NAME, null, cv);
    }

    public ArrayList<Question> getAllQuestions() {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME, null);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setId(c.getInt(c.getColumnIndex(QuestionsTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }

    public ArrayList<Question> getQuestions(String hero) {
        ArrayList<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();

        String[] selectionArgs = new String[]{hero};
        Cursor c = db.rawQuery("SELECT * FROM " + QuestionsTable.TABLE_NAME +
                " WHERE " + QuestionsTable.COLUMN_HERO + " = ?", selectionArgs);

        if (c.moveToFirst()) {
            do {
                Question question = new Question();
                question.setId(c.getInt(c.getColumnIndex(QuestionsTable._ID)));
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                questionList.add(question);
            } while (c.moveToNext());
        }

        c.close();
        return questionList;
    }
}*/
